package com.kodtodya.practice.arrays;

import java.util.Scanner;

public class CustomerArrayDemo {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int customerArraySize = 4;
        CustomerArrayDemo customerArrayDemo = new CustomerArrayDemo();
        Customer []customers = new Customer[customerArraySize];
        // accept customer of arraySize
        for (int i = 0; i < 4; i++) {
            Customer customer = customerArrayDemo.acceptCustomerRegistration();
            customers[i] = customer;
        }

        // print customers of customers[] using plain FOR loop
        System.out.println("--------------- output of for loop----------------");
        for (int i = 0; i < 4; i++) {
            System.out.println("Customer-" + i + ": " + customers[i]);
        }

        System.out.println("--------------- output of for-each----------------");
        // print customers of customers[] using FOREach loop
        for (Customer customer : customers) {
            System.out.println("Customer:" + customer);
        }
    }

    static class Customer {
        String firstName;
        String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Customer() {
         }

        @Override
        public String toString() {
            return "Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    private Customer acceptCustomerRegistration() {
        System.out.println("Pls enter first name of customer:");
        String firstName = scanner.nextLine();
        System.out.println("Pls enter last name of customer:");
        String lastName = scanner.nextLine();
        Customer customer = new Customer();
        customer.firstName = firstName;
        customer.lastName = lastName;
        return customer;
       // return new Customer(firstName, lastName);
    }
}
