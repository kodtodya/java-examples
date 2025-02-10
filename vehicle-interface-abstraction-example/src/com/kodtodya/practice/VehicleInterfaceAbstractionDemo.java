package com.kodtodya.practice;

import com.kodtodya.practice.service.VehicleService;
import com.kodtodya.practice.service.impl.BikeService;
import com.kodtodya.practice.service.impl.CarService;

public class VehicleInterfaceAbstractionDemo {
    public static void main(String[] args) {
        // data hiding
        VehicleService vehicleService = new CarService();
        vehicleService.start();

        // data hiding
        vehicleService = new BikeService();
        vehicleService.start();
    }
}