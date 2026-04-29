package in.laksys.order;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	private DiscoveryClient discoveryClient;
	private RestClient restClient;
	
	public OrderController(DiscoveryClient client, RestClient.Builder builder ) {
		this.discoveryClient = client;
		this.restClient = builder.build();
	}
	@GetMapping
	public String getBook() {
		ServiceInstance serviceInstance = discoveryClient.getInstances("CATALOG").get(0);
		
		String serviceAResponse = restClient.get()
			.uri(serviceInstance.getUri())
			.retrieve()
			.body(String.class);
		
		return serviceAResponse;
	}
}
