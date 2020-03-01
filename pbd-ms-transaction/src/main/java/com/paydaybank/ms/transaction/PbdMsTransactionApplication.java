package com.paydaybank.ms.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PbdMsTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbdMsTransactionApplication.class, args);
	}

}
