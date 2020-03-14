package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicrowebservicesIposApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrowebservicesIposApplication.class, args);
	}

}
