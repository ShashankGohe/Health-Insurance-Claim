package com.softcom.system.resistry_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ResistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResistryServiceApplication.class, args);
	}

}
