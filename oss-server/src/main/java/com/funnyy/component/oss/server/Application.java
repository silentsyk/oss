package com.funnyy.component.oss.server;

import com.funnyy.component.oss.server.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}
}
