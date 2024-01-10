package com.itsp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.itsp.model.Passenger;
import com.itsp.model.Tickete;

@Service
public class TripService {

	RestTemplate rs = new RestTemplate();

	public Tickete bookingTicket(Passenger p) {
		String uri = "http://54.208.197.242:8080/book";
		return rs.postForEntity(uri, p, Tickete.class).getBody();
	}

	public List<Tickete> getAllTicket() {
		String uri = "http://54.208.197.242:8080/ticket/all";
		Tickete[] body = rs.getForEntity(uri, Tickete[].class).getBody();
		List<Tickete> ticketes = Arrays.asList(body);
		return ticketes;

	}

}
