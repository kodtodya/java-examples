package com.kodtodya.practice.strings;

import java.util.stream.Stream;

public class StringDemo {

    public static void main(String[] args) {

        // isBlank() demo
        var sentence = "this is my string.";  // sentence contains blank space
        var wordSets = " world word2 word3 "; // set of words contains blank spaces
        var blanks = "      ";                 // only blank spaces

        System.out.println("isBlank (sentence) :" + sentence.isBlank());
        System.out.println("isBlank (wordSets) : " + wordSets.isBlank());
        System.out.println("isBlank (blanks) : " + blanks.isBlank());


        // lines() demo
        sentence = "this\nis\nmy\nstring."; // sentence contains blank spaces

        Stream<String> lines = sentence.lines();

        lines.forEach(System.out::println);

        // repeat() demo
        var blah = "blah "; // blah
        System.out.println("blah.repeat(3) : " + blah.repeat(3));
        System.out.println("blah.repeat(0) : " + blah.repeat(0));

        // strip() demo
        System.out.println("blah.strip() : " + blah.strip());
        System.out.println("blah.contains(\" \") : " + blah.contains(" "));
        System.out.println("blah.strip().contains(\" \") : " + blah.strip().contains(" "));

        // strip() vs trim() demo
        var whitespaceString = "\n\they buddy\u2005";
        System.out.println("whitespaceString.trim() : " + whitespaceString.trim());
        System.out.println("whitespaceString.strip() : " + whitespaceString.strip());
        System.out.println("trim() -eq strip() : " + whitespaceString.trim().equals(whitespaceString.strip()));

        // stripLeading() and stripTrailing()
        var nextWhitespaceString = "\n\t\u2005hey buddy\u2005";
        System.out.println("Actual String with white spaces : " + nextWhitespaceString);
        System.out.println("String after striping leading whitespaces :" + nextWhitespaceString.stripLeading());
        System.out.println("String after striping trailing whitespaces :" + nextWhitespaceString.stripTrailing());
    }
}
