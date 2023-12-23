package com.kodtodya.practice.accessModifiers.service;

import com.kodtodya.practice.accessModifiers.model.Person;
import com.kodtodya.practice.accessModifiers.model.PersonHandler;

public class AccessModifiersDemo {

    public static void main(String[] args) {

        PersonHandler handler = new PersonHandler();
        Person person = handler.createPerson();
        System.out.println("Personal details:" + person);
    }
}
