package com.kodtodya.practice.strings;

import java.util.stream.Stream;

public class StringDemo {

    public static void main(String[] args) {

        // isBlank() demo
        String sentence = "this is my string.";  // sentence contains blank space
        var wordSets = " world word2 word3 "; // set of words contains blank spaces
        var blanks = "      ";                 // only blank spaces

        System.out.println("isBlank (sentence) :" + sentence.isBlank());
        System.out.println("isBlank (wordSets) : " + wordSets.isBlank());
        System.out.println("isBlank (blanks) : " + blanks.isBlank());
        System.out.println("----------------------------");

        // lines() demo
        sentence = "this\nis\nmy\nstring."; // sentence contains blank spaces

        Stream<String> lines = sentence.lines();

        lines.forEach(System.out::println);

        System.out.println("----------------------------");
        // repeat() demo
        var blah = "blah "; // blah
        System.out.println("blah.repeat(3) : " + blah.repeat(3));
        System.out.println("blah.repeat(0) : " + blah.repeat(0));
        System.out.println("----------------------------");

        // trim demo
        var spaceContainedString = " first-word second-word ";
        System.out.println("blah.trim() : " + blah.trim());
        System.out.println("spaceContainedString.trim() : " + spaceContainedString.trim());
        System.out.println("----------------------------");

        // strip() demo
        System.out.println("blah.strip() : " + blah.strip());
        System.out.println("blah.contains(\" \") : " + blah.contains(" "));
        System.out.println("blah.strip().contains(\" \") : " + blah.strip().contains(" "));
        System.out.println("----------------------------");

        // strip() vs trim() demo
        var whitespaceString = "\n\they buddy\u2005";
        System.out.println("whitespaceString.trim() : " + whitespaceString.trim());
        System.out.println("whitespaceString.strip() : " + whitespaceString.strip());
        System.out.println("trim() -eq strip() : " + whitespaceString.trim().equals(whitespaceString.strip()));
        System.out.println("----------------------------");

        // stripLeading() and stripTrailing()
        var nextWhitespaceString = "\n\t\u2005hey buddy\u2005";
        System.out.println("Actual String with white spaces : " + nextWhitespaceString);
        System.out.println("String after striping leading whitespaces :" + nextWhitespaceString.stripLeading());
        System.out.println("String after striping trailing whitespaces :" + nextWhitespaceString.stripTrailing());
        System.out.println("----------------------------");

        String blah1 = new String("blah ");
        System.out.println("blah.equals(blah1): " + blah.equals(blah1));
        System.out.println("blah == blah1: " + (blah == blah1));
        System.out.println("----------------------------");

        System.out.println("blah.length(): " + blah.length());
        System.out.println("----------------------------");

        System.out.println("blah.toUpperCase(): " + blah.toUpperCase());
        System.out.println("----------------------------");

        System.out.println("blah.toLowerCase(): " + blah.toUpperCase().toLowerCase());
        System.out.println("----------------------------");

        byte[] blahBytes = blah.getBytes();
        for (byte blahbyte : blahBytes) {
            System.out.println("blahbyte: " + blahbyte);
        }
        System.out.println("----------------------------");

        System.out.println("blah.concat(\" *double blah*\"): " + blah.concat("*double blah*"));
        System.out.println("blah after concat: " + blah);
        System.out.println("----------------------------");

        System.out.println("blah.replace(\" \", \"##\"): " + blah.replace(" ", "##"));
        System.out.println("----------------------------");

        System.out.println("blah.substring(2, 5): " + blah.substring(2, 5));
        System.out.println("blah.substring(2): " + blah.substring(2));
        System.out.println("----------------------------");


        String firstName = new String("Avadhut");
        System.out.println("firstname:" + firstName);
        firstName = new String("ABCD");
        System.out.println("firstname:" + firstName);

    }
}
