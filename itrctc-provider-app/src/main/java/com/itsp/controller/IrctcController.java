package com.itsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itsp.bean.Passenger;
import com.itsp.bean.Tickete;
import com.itsp.service.TicketBookingService;

@RestController
public class IrctcController {

	@Autowired
	private TicketBookingService service;
	@PostMapping("/book")
	public Tickete bookTicket(@RequestBody Passenger p) {
		return service.bookTicket(p);
	}
	
	@GetMapping("/ticket/all")
	public List<Tickete> showAllTicket(){
		return service.getAllTicket();
	}
}
