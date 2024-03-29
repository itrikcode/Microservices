package com.itsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.itsp.model.Passenger;
import com.itsp.model.Tickete;
import com.itsp.service.TripService;

@Controller
public class TripController {

	@Autowired
	private TripService service;

	@PostMapping("/ticket")
	public String ticketBooking(@ModelAttribute("p") Passenger p, Model model) {
		Tickete ticket = service.bookingTicket(p);
		model.addAttribute("msg", "ticker Number " + ticket.getTicketNum());
		return "bookTicket";
	}

	@GetMapping("/book-ticket")
	public String bookTicket(Model model) {
		model.addAttribute("p", new Passenger());
		return "bookTicket";
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Tickete> allTicketes = service.getAllTicket();
		model.addAttribute("tickets", allTicketes);
	//	model.addAttribute("p", new Passenger());
		return "index";
	}

}
