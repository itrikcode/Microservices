package com.itsp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.itsp.mappingclasses.Passenger;
import com.itsp.mappingclasses.Ticket;

import reactor.core.publisher.Mono;

@Service
public class TripService {
	
	public Mono<Ticket> bookTicker(Passenger p) {
		String uri = "http://3.86.47.219:8080/book";
		return WebClient.create().post().uri(uri)
				.body(BodyInserters.fromValue(p)).retrieve().bodyToMono(Ticket.class);
	}
	
	public Mono<Ticket[]> getAllTikets(){
		String uri = "http://3.86.47.219:8080/ticket/all";
		return WebClient.create().get().uri(uri)
				.retrieve().bodyToMono(Ticket[].class);
	}

}
