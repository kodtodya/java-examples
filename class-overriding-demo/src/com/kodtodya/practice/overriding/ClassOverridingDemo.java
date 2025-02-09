package com.kodtodya.practice.overriding;

import com.kodtodya.practice.overriding.service.CarService;
import com.kodtodya.practice.overriding.service.VehicleService;

public class ClassOverridingDemo {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        vehicleService.move();

        vehicleService = new CarService();
        vehicleService.move();
    }
}