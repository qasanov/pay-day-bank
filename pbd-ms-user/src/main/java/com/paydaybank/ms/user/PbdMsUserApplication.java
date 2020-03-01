package com.paydaybank.ms.user;

import com.paydaybank.ms.user.domain.User;
import com.paydaybank.ms.user.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class PbdMsUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbdMsUserApplication.class, args);
	}



}
