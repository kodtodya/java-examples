package com.avadhut.operator.accessSpecifieer.protectedSpecifier.model;

public class ProtectedSpecifierDemo {
    public static void main(String[] args) {
        Building building = new Building();
        building.id = 1;
        building.name = "Eden garden";
        building.city = "Delhi";
        System.out.println("Building = " + building);
    }
}
