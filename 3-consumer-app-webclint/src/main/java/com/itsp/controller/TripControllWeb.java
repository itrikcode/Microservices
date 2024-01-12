package com.itsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.itsp.mappingclasses.Passenger;
import com.itsp.mappingclasses.Ticket;
import com.itsp.service.TripService;

import reactor.core.publisher.Mono;

@Controller
public class TripControllWeb {
	
	@Autowired
	private TripService service;

	@PostMapping("/ticket")
	public String ticketBooking(@ModelAttribute("p") Passenger p, Model model) {
		Mono<Ticket> bookTicket = service.bookTicker(p);
		model.addAttribute("ticket", bookTicket);
		model.addAttribute("msg", "Your Ticket Booked");
		return "bookTicket";
	}

	@GetMapping("/book-ticket")
	public String bookTicket(Model model) {
		model.addAttribute("p", new Passenger());
		model.addAttribute("ticket", new Ticket());
		return "bookTicket";
	}

	@GetMapping("/")
	public String index(Model model) {
		Mono<Ticket[]> allTickets = service.getAllTikets();
		model.addAttribute("tickets", allTickets);
		return "index";
	}

}
