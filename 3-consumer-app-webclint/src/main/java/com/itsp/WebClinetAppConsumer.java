package com.itsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebClinetAppConsumer {

	public static void main(String[] args) {
		System.out.println("WebClinetAppConsumer.main()");
		SpringApplication.run(WebClinetAppConsumer.class, args);
	}

}
