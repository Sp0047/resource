package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Passanger;
import com.example.demo.model.Ticket;

@Service
public class ServiceImpl {
	
public Ticket ticketStatus(Passanger passanger) {
		
		if(passanger==null) {
			return null;
		}else {
			Ticket t=new Ticket();
			t.setPnr((int) (Math.random()*1000));
			t.setTicketPrice(500);
			t.setTicketStatus("Ticket booked sucessfully");
			return t;
		
		
		}
		
	}

}
