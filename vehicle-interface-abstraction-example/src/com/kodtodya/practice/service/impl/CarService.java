package com.kodtodya.practice.service.impl;

import com.kodtodya.practice.service.VehicleService;

public class CarService implements VehicleService {
    @Override
    public void start() {
        System.out.println("Car is starting..");
    }
}
