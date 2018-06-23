package com.in28minutes.springbootmicroserviceeurekanamingserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMicroserviceEurekaNamingServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceEurekaNamingServer1Application.class, args);
	}
}
