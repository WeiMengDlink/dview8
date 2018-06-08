package com.wz.messerver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MesserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MesserverApplication.class, args);
	}
}
