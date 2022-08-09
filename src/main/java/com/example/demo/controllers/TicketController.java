package com.example.demo.controllers;

import com.example.demo.entities.Ticket;
import com.example.demo.entities.User;
import com.example.demo.messages.SuccessfulLogin;
import com.example.demo.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/login")
    public Object login(@RequestBody User user, HttpSession session) {
        if (user.getUsername().equals("username") && user.getPassword().equals("password")) {
            session.setAttribute("user", user);
            session.setAttribute("isLoggedIn", true);
            session.setAttribute("authenticated", true);
            return new SuccessfulLogin(true, "Login successful");
        }
        else {
            session.setAttribute("authenticated", false);
            throw new RuntimeException("Invalid username or password");
        }
    }

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/create")
    public void createTicket(Ticket ticket) {
        ticketService.createTicket(ticket);
    }

    @GetMapping("/read/{id}")
    public Ticket getTicket(@PathVariable Long id, HttpSession session) {
        if (session.getAttribute("isLoggedIn").equals(true)) {
            return ticketService.readTicket(id);
        }
        else {
            throw new IllegalArgumentException("You are not logged in");
        }
    }

    @PutMapping("/update")
    public void updateTicket(Ticket ticket) {
        ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/delete")
    public void deleteTicket(Ticket ticket) {
        ticketService.deleteTicket(ticket);
    }
}
