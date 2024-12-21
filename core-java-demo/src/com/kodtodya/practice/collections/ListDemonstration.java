package com.kodtodya.practice.collections;

import java.util.ArrayList;

public class ListDemonstration {

    public static void main(String[] args) {
        String city = "Pune";
        String[] cities = new String[5];
        cities[0] = "pune";
        cities[1] = "mumbai";
        cities[2] = "delhi";
        //String[] cities = {"pune", "mumbai", "delhi"};

        ArrayList cityList = new ArrayList();
        cityList.add("pune");
        cityList.add("mumbai");
        cityList.add("delhi");
        cityList.add(100);
        cityList.add(true);
        cityList.add('a');
        cityList.add(103);
        cityList.add(8.2f);
        cityList.add(83872.27942842d);
        cityList.add(8737648246242489223l);

        System.out.println("City: " + city);
        System.out.println("Cities[]: " + cities);
        System.out.println("ArrayList: " + cityList);

        ArrayList<String> cityGenericsList = new ArrayList<>();
        cityGenericsList.add("pune");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("delhi");
        cityGenericsList.add("delhi");
        System.out.println("ArrayList<String>: " + cityGenericsList);
    }
}
