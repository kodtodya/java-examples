package com.kodtodya.practice.overriding.service;

public class CarService extends VehicleService {

    @Override
    public void move() {
        System.out.println("car is moving..");
    }
}
