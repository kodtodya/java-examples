package com.kodtodya.practice.dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JavaDateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date: " + date);

        DateFormat  formatter = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss.SSS");
        String dateInString = formatter.format(date);
        System.out.println("Formatted date: " + dateInString);

        LocalDate today = LocalDate.now();
        LocalDate monthOldDate = LocalDate.of(2025,1,23);

        System.out.println("date difference: " + ChronoUnit.DAYS.between(monthOldDate, today));
        System.out.println("date difference: " + Period.between(monthOldDate, today).getDays());
    }
}
