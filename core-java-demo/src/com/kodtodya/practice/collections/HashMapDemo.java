package com.kodtodya.practice.collections;

import java.util.*;

class HashMapDemo {

    public static void main(String[] args) {
        // Creating map using the HashMap class
        Map<Integer, String> cities = new HashMap<>();

        // put() - Add elements to the map
        cities.put(0, "Pune"); // index = 0
        cities.put(1, "Mumbai"); // index = 1
        cities.put(2,"Delhi"); // index = 2
        System.out.println("Map: " + cities);
        System.out.println("-----------------------------");

        //get() - helps to randomly access elements from maps
        String mumbaiCity = cities.get(1);
        System.out.println("Accessed Element: " + mumbaiCity);
        System.out.println("-----------------------------");

        //remove() - removes an element from the map
        String removedCity = cities.remove(1);
        System.out.println("Removed Element: " + removedCity);
        System.out.println("Remaining map: " + cities);
        System.out.println("-----------------------------");

        Map<Integer, String> newCitiesMap = new HashMap<>();
        //putAll() - adds all elements of one map to another
        newCitiesMap.putAll(cities);
        // Map<Integer, String> newCitiesMap = new HashMap<>(cities);
        newCitiesMap.put(3,"Bengaluru");
        System.out.println("New Cities map: " + newCitiesMap);
        System.out.println("-----------------------------");

        //containsKey() - returns true if a map contains specified key
        if (newCitiesMap.containsKey(2)) {
            System.out.println(2 + " value is present in newCitiesMap");
        }

        //containsValue() - returns true if a map contains specified value
        if (newCitiesMap.containsValue("Bengaluru")) {
            System.out.println("\"Bengaluru\" value is present in newCitiesMap");
        }
        System.out.println("-----------------------------");

        //size() - returns the length of maps
        System.out.println("Size of newCitiesMap: " + newCitiesMap.size());
        System.out.println("-----------------------------");

        //keySet() - return he set of keys
        Set<Integer> citiesKeySet = newCitiesMap.keySet();
        Iterator<Integer> citiesKeyIterator = citiesKeySet.iterator();
        while (citiesKeyIterator.hasNext()) {
            System.out.println("next Key in newCitiesMap: " + citiesKeyIterator.next());
        }
        System.out.println("Highest key in the keyset is: "+ Collections.max(citiesKeySet));
        System.out.println("Lowest key in the keyset is: "+ Collections.min(citiesKeySet));
        System.out.println("-----------------------------");

        //valueSet() - return he set of values
        Iterator<String> citiesValueIterator = newCitiesMap.values().iterator();
        while (citiesValueIterator.hasNext()) {
            System.out.println("next Value in newCitiesMap: " + citiesValueIterator.next());
        }
        System.out.println("-----------------------------");

        //entrySet() - returns iterator object that can be used to sequentially access elements of maps
        Set<Map.Entry<Integer, String>> citiesEntrySet = newCitiesMap.entrySet();
        Iterator<Map.Entry<Integer, String>> citiesIterator = citiesEntrySet.iterator();
        while (citiesIterator.hasNext()) {
            Map.Entry<Integer, String> entry = citiesIterator.next();
            System.out.println("next entry in newCitiesMap: {" + entry.getKey() + ", " + entry.getValue() + " }");
        }
        System.out.println("-----------------------------");

        //put() - changes elements of maps
        newCitiesMap.put(2, "Ahmadabad");
        // for each loop example
        for (Map.Entry<Integer, String> entry : newCitiesMap.entrySet()) {
            System.out.println("next entry in newCitiesMap: {" + entry.getKey() + ", " + entry.getValue() + " }");
        }
        System.out.println("-----------------------------");

        //remove() - removes all the elements from the map
        System.out.println("Before removal - Cities map: " + cities);
        System.out.println("Before removal - New Cities map: " + newCitiesMap);
        System.out.println("removed all elements of cities map from newCitiesMap: " + newCitiesMap.remove(2));
        System.out.println("After removal - Remaining New Cities map: " + newCitiesMap);
        System.out.println("-----------------------------");

        //clear() - removes all the elements from the map (more efficient than removeAll())
        System.out.println("Size of newCitiesMap before clear(): " + newCitiesMap.size());
        newCitiesMap.clear();
        System.out.println("Size of newCitiesList after clear(): " + newCitiesMap.size());
    }
}