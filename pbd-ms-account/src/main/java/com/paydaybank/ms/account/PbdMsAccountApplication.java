package com.paydaybank.ms.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PbdMsAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbdMsAccountApplication.class, args);
	}

}
