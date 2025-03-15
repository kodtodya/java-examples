package com.kodtodya.service;

import com.kodtodya.model.Address;
import com.kodtodya.model.Student;
import com.kodtodya.repository.AddressRepository;
import com.kodtodya.repository.StudentRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    private static final StudentRepository studentRepository = new StudentRepository();
    private static final AddressRepository addressRepository = new AddressRepository();

    public void insertStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter student id:");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Pls enter student name:");
        String name = scanner.nextLine();
        System.out.println("Pls enter student Address Id:");
        int addressId = Integer.parseInt(scanner.nextLine());
        System.out.println("Pls enter student percentage:");
        float percentage = Float.parseFloat(scanner.nextLine());
        System.out.println("Pls enter student grade:");
        String grade = scanner.nextLine();

        Address address = addressRepository.retrieveAddress(addressId);
        Student student = new Student(studentId, name, address, percentage, grade);

        try {
            if (studentRepository.insertStudent(student)) {
                System.out.println("Employee inserted successfully!");
            } else {
                System.out.println("Failed to insert employee.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
