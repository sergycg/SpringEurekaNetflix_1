package com.services.eurekaserverti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaservertiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaservertiApplication.class, args);
	}

}
