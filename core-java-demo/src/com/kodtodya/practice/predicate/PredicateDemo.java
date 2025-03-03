package com.kodtodya.practice.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //PredicateDemo demo = new PredicateDemo();

        Predicate<Integer> noGreaterThan100 = (no) -> no > 100;
        System.out.println("no greater than 100? " + noGreaterThan100.test(114));

        Predicate<String> isStringContainsZero = (input) -> input.contains("0");

        Predicate<String> isStringNotContainsZero = Predicate.not(isStringContainsZero);
        System.out.println("string contains 0? " + isStringContainsZero.test("avadhut10"));
        System.out.println("string contains 0? " + isStringContainsZero.test("0pune"));
        System.out.println("string NOT contains 0? " + isStringNotContainsZero.test("0pune"));
    }

    // old-fashioned code
//    public boolean noGreaterThan100(int no) {
//        return no > 100;
//    }
//
//    public boolean isStringContainsZero(String input) {
//        return input.contains("0");
//    }
}
