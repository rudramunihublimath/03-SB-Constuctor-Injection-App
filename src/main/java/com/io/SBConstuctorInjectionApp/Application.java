package com.io.SBConstuctorInjectionApp;

import com.io.SBConstuctorInjectionApp.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.printUserName(101);
	}

}
