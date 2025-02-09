package com.kodtodya.practice.service.impl;

import com.kodtodya.practice.service.VehicleService;

public class BikeService implements VehicleService {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}
