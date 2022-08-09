package com.example.demo.exceptions;

public class TicketNotFoundException extends RuntimeException {
    public TicketNotFoundException() {
        super("Error 404: Ticket not found");
    }
}
