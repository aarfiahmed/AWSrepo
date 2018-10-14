package com.user.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.user.application.controller.UserController;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.user.application.exception.handler" })
@EnableScheduling
public class UserApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(UserController.class);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {

		return builder.sources(UserApplication.class);
	}
}
