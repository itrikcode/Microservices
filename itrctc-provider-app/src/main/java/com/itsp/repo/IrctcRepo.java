package com.itsp.repo;

import java.util.List;

import com.itsp.bean.Passenger;
import com.itsp.bean.Tickete;

public interface IrctcRepo {
	
	public Tickete bookTickete(Passenger p);
	public List<Tickete> showTickets();

}
