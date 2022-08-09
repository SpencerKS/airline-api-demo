package com.example.demo;

import com.example.demo.controllers.TicketController;
import com.example.demo.dao.TicketDAO;
import com.example.demo.entities.Ticket;
import com.example.demo.services.TicketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
