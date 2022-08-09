package com.example.demo.bootstrap;

import com.example.demo.dao.CarDAO;
import com.example.demo.dao.HotelDAO;
import com.example.demo.dao.TicketDAO;
import com.example.demo.entities.Car;
import com.example.demo.entities.Hotel;
import com.example.demo.entities.Ticket;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private TicketDAO ticketDAO;
    private CarDAO carDAO;
    private HotelDAO hotelDAO;

    public BootStrap(TicketDAO ticketDAO, CarDAO carDAO, HotelDAO hotelDAO) {
        this.ticketDAO = ticketDAO;
        this.carDAO = carDAO;
        this.hotelDAO = hotelDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        Ticket ticket = new Ticket("John", "Doe", "Atlanta", "New York");
        Car car = new Car("Ford", "Fiesta", "2015", "red", "John", "Doe");
        Hotel hotel = new Hotel("John", "Doe", "Atlanta", "101");

        carDAO.save(car);
        hotelDAO.save(hotel);

        ticket.setCar(car);
        ticket.setHotel(hotel);
        ticketDAO.save(ticket);

        System.out.println("Saved Ticket - Id: " + ticket.getId());
    }
}
