package com.kodtodya.practice.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {

        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // add 1 month to current date
        LocalDate oneMonthLaterDate = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("After 1 month, date will be: " + oneMonthLaterDate);
        LocalDate twentyEightDayAgoDate = today.minus(28, ChronoUnit.DAYS);
        //LocalDate twentyEightDayAgoDate = today.minusDays(28);
        System.out.println("28 days ago, date was: " + twentyEightDayAgoDate);

        LocalDateTime todaysTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + todaysTime);
        LocalDateTime oneMinLaterDateTime = todaysTime.plusMinutes(1);
        System.out.println("After 1 minute, date will be: " + oneMinLaterDateTime);

        LocalDateTime fourDaysAgoDateTime = todaysTime.minusHours(95);
        System.out.println("4 days ago, date time was: " + fourDaysAgoDateTime);
    }
}
