package com.itsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsp.bean.Passenger;
import com.itsp.bean.Tickete;
import com.itsp.repo.IrctcRepo;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {

	@Autowired
	private IrctcRepo repo;
	
	@Override
	public Tickete bookTicket(Passenger p) {
		 return repo.bookTickete(p);
	}

	@Override
	public List<Tickete> getAllTicket() {
	 return repo.showTickets();
	}

}
