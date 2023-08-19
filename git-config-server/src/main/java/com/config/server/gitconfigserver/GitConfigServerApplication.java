package com.config.server.gitconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GitConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitConfigServerApplication.class, args);
	}

}
