package com.example.demo.services;

import com.example.demo.entities.Ticket;

public interface TicketServiceInterface {
    public void createTicket(Ticket ticket);
    public Ticket readTicket(Long id);
    public void updateTicket(Ticket ticket);
    public void deleteTicket(Ticket ticket);
}
