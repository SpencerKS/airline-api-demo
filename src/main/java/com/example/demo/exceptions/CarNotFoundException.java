package com.example.demo.exceptions;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("Error 404: Car not found");
    }
}
