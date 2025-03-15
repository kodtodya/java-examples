package com.kodtodya.practice.strings;

public class TestStringDemo {
    public static void main(String[] args) {
        var nextWhitespaceString = "\n\t\u2005hey buddy\u2005";
        System.out.println("our string:" + nextWhitespaceString);
        System.out.println("our string after trim():" + nextWhitespaceString.trim());
        System.out.println("our string after strip():" + nextWhitespaceString.strip());
    }
}
