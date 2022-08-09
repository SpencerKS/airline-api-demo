package com.example.demo.controllers;

import com.example.demo.entities.Car;
import com.example.demo.entities.User;
import com.example.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/create")
    public void createCar(Car car) {
        carService.createCar(car);
    }

    @GetMapping("/read/{id}")
    public Car readCar(@PathVariable Long id) {
        return carService.readCar(id);
    }

    @PutMapping("/update")
    public void updateCar(Car car) {
        carService.updateCar(car);
    }

    @DeleteMapping("/delete")
    public void deleteCar(Car car) {
        carService.deleteCar(car);
    }
}
