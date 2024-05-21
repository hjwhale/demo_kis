package com.kis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.kis.demo"})
public class DemoKisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoKisApplication.class, args);
	}

}
