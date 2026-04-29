# Virtual Bookstore

This project consists of 6 microservices that cover the foundational "cloud-native" patterns:

* **API Gateway:** The single entry point for all client requests (e.g., web or mobile app).
* **Discovery Server:** Acts as a phonebook where all other services register themselves so they can find each other.
* **Config Server:** Manages settings (like database credentials) for all services in one central place.
* **Catalog Service:** Manages book details, pricing, and availability.
* **Order Service:** Handles the creation and processing of customer purchases.
* **Notification Service:** Sends confirmation emails or alerts asynchronously after an order is placed.
