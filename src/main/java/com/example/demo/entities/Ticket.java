package com.example.demo.entities;
import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Car car;
    @OneToOne
    private Hotel hotel;

    private String firstName;
    private String lastName;
    private String departureCity;
    private String destinationCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticket() {

    }

    public Ticket(String firstName, String lastName, String departureCity, String destinationCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public String getDestinationCity() {
        return destinationCity;
    }
}
