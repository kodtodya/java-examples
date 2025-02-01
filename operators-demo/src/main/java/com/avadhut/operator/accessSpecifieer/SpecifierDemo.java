package com.avadhut.operator.accessSpecifieer;

import com.avadhut.operator.accessSpecifieer.defaultSpecifier.model.City;
import com.avadhut.operator.accessSpecifieer.privateSpecifier.model.Vehicle;
import com.avadhut.operator.accessSpecifieer.protectedSpecifier.model.Building;
import com.avadhut.operator.accessSpecifieer.publicSpecifier.model.Student;

public class SpecifierDemo {
    public static void main(String[] args) {
        SpecifierDemo specifierDemo = new SpecifierDemo();
        specifierDemo.publicSpecifierDemo();

        specifierDemo.privateSpecifierDemo();

        specifierDemo.protectedSpecifierDemo();

        specifierDemo.defaultSpecifierDemo();
    }

    void publicSpecifierDemo() {
        Student student = new Student();
        student.id = 1;
        student.name = "Aman";
        student.city = "mumbai";

        System.out.println("Student = " + student);
    }

    void privateSpecifierDemo() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setMake("Mahindra");
        vehicle.setModel("xuv500");
        System.out.println("Vehicle=" + vehicle);
    }

    void protectedSpecifierDemo() {
        Building building = new Building();
        building.setId(1);
        building.setName("ABC Building");
        building.setCity("Delhi");
        System.out.println("Building=" + building);
    }

    void defaultSpecifierDemo() {
        City city = new City();
        city.setId(1);
        city.setName("Pune");
        city.setState("MH");
        city.setPincode(411001);
        System.out.println("City=" + city);
    }
}
