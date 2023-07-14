package com.example.springcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Springcloudserver1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloudserver1Application.class, args);
	}

}
