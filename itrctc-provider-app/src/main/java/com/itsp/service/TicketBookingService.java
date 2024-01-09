package com.itsp.service;

import java.util.List;

import com.itsp.bean.Passenger;
import com.itsp.bean.Tickete;

public interface TicketBookingService {
		public Tickete bookTicket(Passenger p);
		public List<Tickete> getAllTicket();
}
