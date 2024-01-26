package com.vicensfayos.springjavakotlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjavakotlinApplication {

	public SpringjavakotlinApplication(Controller2 controller2, Controller controller) {

	}

	public static void main(String[] args) {
		// System.out.println(new Message().getHelloWorld());
		SpringApplication.run(SpringjavakotlinApplication.class, args);
	}
}
