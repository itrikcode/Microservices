package com.itsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TripConsumerAppApplication {

	public static void main(String[] args) {
		System.out.println("TripConsumerAppApplication.main()");
		System.out.println("TripConsumerAppApplication.main()");
		System.setProperty("org.apache.tomcat.util.buf.UDecoder.ALLOW_ENCODED_SLASH", "true");
		SpringApplication.run(TripConsumerAppApplication.class, args);
	}

}
