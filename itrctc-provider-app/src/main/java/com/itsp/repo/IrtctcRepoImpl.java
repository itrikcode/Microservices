package com.itsp.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.itsp.bean.Passenger;
import com.itsp.bean.Tickete;

@Repository
public class IrtctcRepoImpl implements IrctcRepo {

	Map<Integer,Tickete> db = new HashMap<>();
	@Override
	public Tickete bookTickete(Passenger p) {
		Tickete tkt = new Tickete();
		Random random = new Random();
		int num = random.nextInt(5);
		tkt.setTicketNum(num);
		BeanUtils.copyProperties(p, tkt);
		tkt.setTicketStatus("confiremd");
		db.put(num, tkt);
		return tkt;
		
	}

	@Override
	public List<Tickete> showTickets() {
		List<Tickete> list = new ArrayList<>();
		for(Map.Entry<Integer, Tickete> entry : db.entrySet()) {
			Tickete tickete = 	entry.getValue();
			list.add(tickete);
		}
		 return list;
	}

}
