package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ServerConfignewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfignewApplication.class, args);
	}
}
