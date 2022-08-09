package com.example.demo.services;

import antlr.StringUtils;
import com.example.demo.dao.TicketDAO;
import com.example.demo.entities.Ticket;
import com.example.demo.exceptions.TicketNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class TicketService implements TicketServiceInterface {
    private final TicketDAO ticketDAO;

    @Autowired
    public TicketService(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }

    public void createTicket(Ticket ticket) {
        ticketDAO.save(ticket);
    }

    public Ticket readTicket(Long id) {
        return ticketDAO.findById(id).orElseThrow(() -> new TicketNotFoundException());
    }

    public void updateTicket(Ticket ticket) {
        ticketDAO.save(ticket);
    }

    public void deleteTicket(Ticket ticket) {
        ticketDAO.delete(ticket);
    }
}
