package com.kodtodya.practice.collections;

import java.util.*;

class HashSetDemo {

    public static void main(String[] args) {
        // Creating set using the HashSet class
        Set<String> cities = new HashSet<>();

        // add() - Add elements to the set
        cities.add("Pune"); // index = 0
        cities.add("Mumbai"); // index = 1
        cities.add("Delhi"); // index = 2
        System.out.println("Set: " + cities);
        System.out.println("-----------------------------");

        //remove() - removes an element from the set
        System.out.println("Removed Element- \"Mumbai\": " + cities.remove("Mumbai"));
        System.out.println("Remaining set: " + cities);
        System.out.println("-----------------------------");

        Set<String> newCitiesSet = new HashSet<>();
        //addAll() - adds all elements of one set to another
        newCitiesSet.addAll(cities);
        newCitiesSet.add("Bengaluru");
        System.out.println("New Cities Set: " + newCitiesSet);
        System.out.println("-----------------------------");

        //contains() - returns true if a set contains specified element
        if (newCitiesSet.contains(2)) {
            System.out.println(2 + " value is present in newCitiesSet");
        }

        if (newCitiesSet.contains("Bengaluru")) {
            System.out.println("\"Bengaluru\" value is present in newCitiesSet");
        }
        System.out.println("-----------------------------");

        //size() - returns the length of set
        System.out.println("Size of newCitiesSet: " + newCitiesSet.size());
        System.out.println("-----------------------------");

        //iterator() - returns iterator object that can be used to sequentially access elements of set
        Iterator<String> citiesIterator = newCitiesSet.iterator();
        while (citiesIterator.hasNext()) {
            System.out.println("next element in newCitiesSet: " + citiesIterator.next());
        }
        System.out.println("-----------------------------");

        // for each loop example
        System.out.println("Using for each loop:");
        for (String city : newCitiesSet) {
            System.out.println("next city: " + city);
        }
        System.out.println("-----------------------------");

        //toArray() - converts a set into an array
        // advance implementation with reference operator
        String[] citiesArray = newCitiesSet.toArray(String[]::new);
        //String[] citiesArray = newCitiesSet.toArray(new String[newCitiesSet.size()]);
        for(String city : citiesArray) {
            System.out.println("Conversion to Array: " + city);
        }
        System.out.println("-----------------------------");

        //removeAll() - removes all the elements from the set
        System.out.println("Before removal - Cities List: " + cities);
        System.out.println("Before removal - New Cities List: " + newCitiesSet);
        System.out.println("removed all elements of cities list from newCitiesList: " + newCitiesSet.removeAll(cities));
        System.out.println("After removal - Remaining New Cities List: " + newCitiesSet);
        System.out.println("-----------------------------");

        //clear() - removes all the elements from the set (more efficient than removeAll())
        System.out.println("Size of newCitiesList before clear(): " + newCitiesSet.size());
        newCitiesSet.clear();
        System.out.println("Size of newCitiesList after clear(): " + newCitiesSet.size());

        //iterator() - returns an iterator that can be used to access elements of the set sequentially
        //remove() - removes the specified element from the set
        //removeAll() - removes all the elements from the set that is present in another specified set
        //retainAll() - retains all the elements in the set that are also present in another specified set
        //clear() - removes all the elements from the set
        //size() - returns the length (number of elements) of the set
        //toArray() - returns an array containing all the elements of the set
        //contains() - returns true if the set contains the specified element
        //containsAll() - returns true if the set contains all the elements of the specified collection
        //hashCode() - returns a hash code value (address of the element in the set)
    }
}