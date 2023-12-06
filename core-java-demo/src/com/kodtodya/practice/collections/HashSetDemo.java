package com.kodtodya.practice.collections;

import java.util.Set;
import java.util.HashSet;

class HashSetDemo {

    public static void main(String[] args) {
        // Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();

        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        //add() - adds the specified element to the set
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        //addAll() - adds all the elements of the specified collection to the set - Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);

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