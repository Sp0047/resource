package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passanger;
import com.example.demo.model.Ticket;
import com.example.demo.service.ServiceImpl;

@RestController
public class TicketController {
	
	@Autowired
	private ServiceImpl service;
	
	@PostMapping(value ="/bookTicket" ,consumes = {"application/json"} ,produces = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger) {
		Ticket ticketStatus = service.ticketStatus(passanger);
		
		if(ticketStatus==null) {
			System.out.println(ticketStatus);
			ticketStatus.setTicketStatus("Booking not confirmed");
			
			return new ResponseEntity<Ticket>(ticketStatus,HttpStatus.BAD_REQUEST);
		}else
		
			return new ResponseEntity<Ticket>(ticketStatus,HttpStatus.OK);

		
	
	}

}
