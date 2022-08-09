package com.example.demo.exceptions;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException() {
        super("Error 404: Hotel not found");
    }
}
