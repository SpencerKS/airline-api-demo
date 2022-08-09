package com.example.demo.services;

import com.example.demo.entities.Hotel;

public interface HotelServiceInterface {
    public void createHotel(Hotel hotel);
    public Hotel readHotel(Long id);
    public void updateHotel(Hotel hotel);
    public void deleteHotel(Hotel hotel);


}
