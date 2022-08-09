package com.example.demo.services;

import com.example.demo.dao.CarDAO;
import com.example.demo.entities.Car;
import com.example.demo.exceptions.CarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService implements CarServiceInterface {
    private final CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public void createCar(Car car) {
        carDAO.save(car);
    }

    public Car readCar(Long id) {
        return carDAO.findById(id).orElseThrow(() -> new CarNotFoundException());
    }

    public void updateCar(Car car) {
        carDAO.save(car);
    }

    public void deleteCar(Car car) {
        carDAO.delete(car);
    }
}
