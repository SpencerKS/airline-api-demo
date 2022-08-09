package com.example.demo.dao;

import com.example.demo.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CarDAO extends JpaRepository<Car, Long> {

}
