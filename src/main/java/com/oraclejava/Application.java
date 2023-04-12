package com.oraclejava;

import org.springframework.boot.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
////http://localhost:8093/customers
@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class,args);
				
	}
}
