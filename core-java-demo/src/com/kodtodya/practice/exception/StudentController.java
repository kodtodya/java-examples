package com.kodtodya.practice.exception;

import com.kodtodya.practice.exception.customException.InvalidMarkException;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void addMarks() {
        try {
            studentService.addMarks();
        } catch (InvalidMarkException invalidMarkException) {
            System.err.println(invalidMarkException.getMessage());
        } finally {
            System.out.println("finally block executed..");
        }
    }
}
