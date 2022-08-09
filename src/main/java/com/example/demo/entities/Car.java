package com.example.demo.entities;
import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Hotel hotel;
    @OneToOne
    private Ticket ticket;

    private String make;
    private String model;
    private String yr;
    private String color;
    private String firstName;
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Car() {

    }

    public Car(String make, String model, String yr, String color, String firstName, String lastName) {
    	this.make = make;
    	this.model = model;
    	this.yr = yr;
    	this.color = color;
    	this.firstName = firstName;
    	this.lastName = lastName;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
