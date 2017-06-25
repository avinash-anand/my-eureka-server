package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServerApplication {

	public static void main(String[] args) {
		// Tell server to look for my-eureka-server.properties or my-eureka-server.yml
		// System.setProperty("spring.config.name", "my-eureka-server");

		SpringApplication.run(MyEurekaServerApplication.class, args);
	}
}
