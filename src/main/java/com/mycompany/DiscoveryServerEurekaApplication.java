package com.mycompany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerEurekaApplication {

	private static Logger logger = LoggerFactory.getLogger(DiscoveryServerEurekaApplication.class);

	public static void main(String[] args) {
		logger.debug("\n\n\nAll Environment Variables - " + System.getenv());
		logger.debug("\n\n\nAll System Properties - " + System.getProperties());
		SpringApplication.run(DiscoveryServerEurekaApplication.class, args);
	}
}
