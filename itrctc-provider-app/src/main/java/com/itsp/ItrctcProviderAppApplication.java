package com.itsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItrctcProviderAppApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("Hi");
		System.out.println("ItrctcProviderAppApplication.main()");
		System.setProperty("org.apache.tomcat.util.buf.UDecoder.ALLOW_ENCODED_SLASH", "true");
		SpringApplication.run(ItrctcProviderAppApplication.class, args);
	}

}
