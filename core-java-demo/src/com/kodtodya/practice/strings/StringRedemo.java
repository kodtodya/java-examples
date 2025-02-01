package com.kodtodya.practice.strings;

import java.util.stream.Stream;

public class StringRedemo {

    public static void main(String[] args) {

        String country = "India"; // string literal
        String indiaString = new String("India"); // string object

        System.out.println("String literal: " + country);
        System.out.println("String object: " + indiaString);

        // immutable string objects trying to change
        indiaString = new String("india123");
        System.out.println("String object: " + indiaString);
        System.out.println("----------------------------------------");

        // mutable objects - for non-multi-threading application
        StringBuilder greetings = new StringBuilder("hi there");
        System.out.println("Current object: "+ greetings);
        greetings.append(", good afternoon!");
        System.out.println("Current object: "+ greetings);
        greetings = new StringBuilder("its a sunny day!");
        System.out.println("Current object: "+ greetings);

        // mutable objects - for multi-threading application
        StringBuffer stringBuffer = new StringBuffer("hey");
        System.out.println("Current string buffer: " + stringBuffer);
        stringBuffer.append(", how are you?");
        System.out.println("Current string buffer: " + stringBuffer);
        stringBuffer = new StringBuffer("feeling sleep?");
        System.out.println("Current string buffer: " + stringBuffer);

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");

        String sentence = "this is my string.";  // sentence contains blank space
        var wordSets = " word1 word2 word3 "; // set of words contains blank spaces
        var blanks = "      ";

        // isBlank() - identifies that current string is blank or not
        System.out.println("sentence.isBlank(): " + sentence.isBlank());
        System.out.println("wordSets.isBlank(): " + wordSets.isBlank());
        System.out.println("blanks.isBlank(): " + blanks.isBlank());
        System.out.println("----------------------------------------");

        // isEmpty() - identifies that current string is empty or not (length == 0)
        System.out.println("sentence.isEmpty(): " + sentence.isEmpty());
        System.out.println("wordSets.isEmpty(): " + wordSets.isEmpty());
        System.out.println("blanks.isEmpty(): " + blanks.isEmpty());
        System.out.println("----------------------------------------");

        //repeat - repeats current string
        String blah = new String("Blah ");
        String repeatedString = blah.repeat(3);
        System.out.println("blah.repeat(3): " + repeatedString);
        System.out.println("----------------------------------------");

        //trim - remove spaces from both ends
        System.out.println("before wordSets.trim(): " + wordSets);
        System.out.println("wordSets.trim(): " + wordSets.trim());
        System.out.println("same string after wordSets.trim(): " + wordSets);
        System.out.println("----------------------------------------");

        //strip - remove blank spaces
        System.out.println("before wordSets.strip(): " + wordSets);
        System.out.println("wordSets.strip(): " + wordSets.strip());
        System.out.println("same string after wordSets.strip(): " + wordSets);
        System.out.println("----------------------------------------");

        // trim() vs strip()
        var whitespaceString = "\n\they buddy\u2005";
        System.out.println("whitespaceString: " + whitespaceString);
        System.out.println("whitespaceString.strip(): " + whitespaceString.strip());

        //stripLeading() and stripTrailing()
        System.out.println("whitespaceString.stripLeading(): " + whitespaceString.stripLeading());
        System.out.println("whitespaceString.stripTrailing(): " + whitespaceString.stripTrailing());
        System.out.println("----------------------------------------");

        // lines
        sentence = "this\nis\nmy\nstring."; // sentence contains blank spaces
        System.out.println("sentence: " + sentence);

        Stream<String> streamLines = sentence.lines();
        streamLines.forEach(line -> System.out.println("Line: " + line));
        System.out.println("----------------------------------------");

        // it will check the similarity in object location
        if (country == indiaString) {
            System.out.println("country == indiaString: both the string objects are exact same");
        } else {
            System.out.println("country == indiaString: both the string objects are NOT exactly same");
        }
        System.out.println("----------------------------------------");

        // this checks the similarity in value
        indiaString = new String("India");
        if (country.equals(indiaString)) {
            System.out.println("country.equals(indiaString): both the string values are exact same");
        } else {
            System.out.println("country.equals(indiaString): both the string values are NOT exactly same");
        }
        System.out.println("----------------------------------------");

        System.out.println("indiaString.length(): " + indiaString.length());
        System.out.println("----------------------------------------");

        System.out.println("indiaString: " + indiaString);
        String replacedString = indiaString.replace("I", "i");
        System.out.println("indiaString.replace(): " + replacedString);
        String secondTimeReplacedString = indiaString.replace("i", "I");
        System.out.println("indiaString.replace(): " + secondTimeReplacedString);
        System.out.println("----------------------------------------");

        System.out.println("indiaString.substring(3): " + indiaString.substring(3));
        System.out.println("indiaString.substring(3, 5): " + indiaString.substring(3, 5));
        System.out.println("indiaString.substring(1, 4): " + indiaString.substring(1, 4));
        System.out.println("----------------------------------------");

        System.out.println("indiaString.toUpperCase(): " + indiaString.toUpperCase());
        System.out.println("indiaString.toLowerCase(): " + indiaString.toLowerCase());
        System.out.println("----------------------------------------");

        indiaString.concat(" new content ");
        System.out.println("indiaString.concat(): " + indiaString.concat(" new content "));

        byte[] indiaBytes = indiaString.getBytes();
        System.out.println("byte[] of indiastring: " + indiaBytes);

    }
}
