package com.example.demo.services;

import com.example.demo.entities.Car;

public interface CarServiceInterface {
    public void createCar(Car car);
    public Car readCar(Long id);
    public void updateCar(Car car);
    public void deleteCar(Car car);
}

