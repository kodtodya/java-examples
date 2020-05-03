package com.kodtodya.practice.unicodeScripts;
public class UnicodeScriptDemo
{
    public static void main(String args[])
    {
        // variable declaration in devnagari script
        var गीत = "Song";
        // variable declaration in Thai script
        var พ = "sample thai character";

        // Devnagari variable usage in java-code
        System.out.println("गीत  means " + गीत);

        // Thai variable usage in java-code
        System.out.println("พ  is " + พ );

        // Some other usage of different Unicode characters
        System.out.println("त' is " + Character.UnicodeBlock.of('त') + " script");
        System.out.println("a is " + Character.UnicodeBlock.of('a') + " script");
        System.out.println("พ is " + Character.UnicodeBlock.of('พ') + " script");
    }
} 