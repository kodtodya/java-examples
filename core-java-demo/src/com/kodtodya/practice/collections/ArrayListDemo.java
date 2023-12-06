package com.kodtodya.practice.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class ArrayListDemo {

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<String> cities = new ArrayList<>();

        // add() - Add elements to the list
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        System.out.println("List: " + cities);

        //get() - helps to randomly access elements from lists
        String mumbaiCity = cities.get(1);
        System.out.println("Accessed Element: " + mumbaiCity);

        //remove() - removes an element from the list
        String removedCity = cities.remove(1);
        System.out.println("Removed Element: " + removedCity);

        List<String> newCitiesList = new ArrayList<>();
        //addAll() - adds all elements of one list to another
        newCitiesList.addAll(cities);
        newCitiesList.add("Bengaluru");

        //contains() - returns true if a list contains specified element
        if (newCitiesList.contains(2)) {
            System.out.println(2 + " value is present in newCitiesList");
        }

        //size() - returns the length of lists
        System.out.println("Size of newCitiesList: " + newCitiesList.size());

        //iterator() - returns iterator object that can be used to sequentially access elements of lists
        Iterator<String> intIterator = newCitiesList.iterator();
        while (intIterator.hasNext()) {
            System.out.println("next element in newCitiesList: " + intIterator.next());
        }

        //set() - changes elements of lists
        newCitiesList.set(2, "Ahmadabad");
        while (intIterator.hasNext()) {
            System.out.println("next element in newCitiesList: " + intIterator.next());
        }

        //toArray() - converts a list into an array
        String[] citiesArray = newCitiesList.toArray(String[]::new);
        for(String city : citiesArray) {
            System.out.println("Conversion to Array: " + city);
        }

        //removeAll() - removes all the elements from the list
        System.out.println("removed all elements of cities list from newCitiesList: " + newCitiesList.removeAll(cities));

        //clear() - removes all the elements from the list (more efficient than removeAll())
        newCitiesList.clear();
        System.out.println("Size of newCitiesList after clear(): " + newCitiesList.size());

    }
}