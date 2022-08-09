package com.example.demo.services;

import com.example.demo.dao.HotelDAO;
import com.example.demo.entities.Hotel;
import com.example.demo.exceptions.HotelNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService implements HotelServiceInterface {
    private final HotelDAO hotelDAO;

    @Autowired
    public HotelService(HotelDAO hotelDAO) {
        this.hotelDAO = hotelDAO;
    }

    public void createHotel(Hotel hotel) {
        hotelDAO.save(hotel);
    }

    public Hotel readHotel(Long id) {
        return hotelDAO.findById(id).orElseThrow(() -> new HotelNotFoundException());
    }

    public void updateHotel(Hotel hotel) {
        hotelDAO.save(hotel);
    }

    public void deleteHotel(Hotel hotel) {
        hotelDAO.delete(hotel);
    }
}
