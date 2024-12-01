package com.avadhut.operator.instanceOf;

public class InstanceOfOperatorDemo {

    public static void main(String[] args) {

        String city = "Pune";
        Integer length = 23;
        Double temparature = 36.5;

        if (city instanceof String) {
            System.out.println("type of city is String");
        } else {
            System.out.println("type of city is NOT String");
        }

        if (length instanceof Integer) {
            System.out.println("type of length is integer");
        } else {
            System.out.println("type of length is NOT integer");
        }

        if (temparature instanceof Double) {
            System.out.println("type of temparature is double");
        } else {
            System.out.println("type of temparature is NOT double");
        }
    }
}
