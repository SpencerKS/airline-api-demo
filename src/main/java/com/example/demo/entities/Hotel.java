package com.example.demo.entities;
import javax.persistence.*;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Car car;
    @OneToOne
    private Ticket ticket;

    private String firstName;
    private String lastName;
    private String hotelName;
    private String roomNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hotel() {

    }

    public Hotel(String firstName, String lastName, String hotelName, String roomNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
