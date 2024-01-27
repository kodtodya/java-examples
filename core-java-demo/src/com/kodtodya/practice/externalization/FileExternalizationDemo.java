package com.kodtodya.practice.externalization;

import java.io.*;

public class FileExternalizationDemo {

    // File - which will store employee data
    private static final File EMPLOYEE_DATA_FILE = new File("employee-data.txt");

    public static void main(String... args) throws Exception {

        // employee object - we will store this data in above file
        Employee employee = new Employee(1, "Amit", "Pune");

        // storing the data in employee-data.txt file
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_DATA_FILE));
        outStream.writeObject(employee);
        outStream.flush();
        System.out.println("Data stored to file...");

        System.out.println("Now, reading data from stored file...");
        // Read data from employee-data.txt file
        ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(EMPLOYEE_DATA_FILE));
        Employee readEmployeeObject = (Employee) inStream.readObject();

        // print the data that we read
        System.out.println("After De externalization of Employee: "
                + "\nEmployee Id: " + readEmployeeObject.getEmpId()
                + "\nName:" + readEmployeeObject.getName()
                + "\nAddress:" + readEmployeeObject.getAddress());
    }
}