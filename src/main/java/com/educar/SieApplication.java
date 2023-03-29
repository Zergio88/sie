package com.educar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.educar;"})
public class SieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SieApplication.class, args);
	}

}
