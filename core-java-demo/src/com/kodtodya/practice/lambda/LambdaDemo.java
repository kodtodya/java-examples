package com.kodtodya.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		// local variable inference as lambda expression/function does not need 
		// explicit declaration of data type; it is being identified implicitly
		Function<String, String> lowercase = string -> string.toLowerCase();
		
		System.out.println(lowercase.apply("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		
		Function<String[], List<String>> listCalculator = array -> Arrays.asList(array);
		
		System.out.println(listCalculator.apply("Pune,Mumbai,Nagpur,Kolhapur,Satara".split(",")));
		
		// Java-8 style
		StringAppender java8Appender = (String s1, String s2) -> {return s1 + s2;};
		
		// Java-10 style
		StringAppender java10Appender = (var s1, var s2) ->  s1 + s2;
		
		// Java-11 style
		StringAppender java11Appender = (s1, s2) -> s1 + s2;
		
		System.out.println("Functional Interface for appender with Java-8 style: " + java8Appender.append("Pune ", "city"));
		System.out.println("Functional Interface for appender with Java-10 style: " + java10Appender.append("Pune ", "city"));
		System.out.println("Functional Interface for appender with Java-11 style: " + java11Appender.append("Pune ", "city"));
	}
	
	@FunctionalInterface
	public interface StringAppender{
		String append(String firstString, String secondString);
	}
}
