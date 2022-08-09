package com.example.demo.controllers;

import com.example.demo.entities.Hotel;
import com.example.demo.entities.User;
import com.example.demo.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/create")
    public void createHotel(Hotel hotel) {
        hotelService.createHotel(hotel);
    }

    @GetMapping("/read/{id}")
    public Hotel readHotel(@PathVariable Long id) {
        return hotelService.readHotel(id);
    }

    @PutMapping("/update")
    public void updateHotel(Hotel hotel) {
        hotelService.updateHotel(hotel);
    }

    @DeleteMapping("/delete")
    public void deleteHotel(Hotel hotel) {
        hotelService.deleteHotel(hotel);
    }
}
