package in.laksys.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
	private static final Logger logger = LoggerFactory.getLogger(DiscoveryApplication.class);
	public static void main(String[] args) {
		logger.info("discovery main starts ...");
		SpringApplication.run(DiscoveryApplication.class, args);
		logger.info("discovery server is up...");
	}

}
