package com.kodtodya.practice.strings;

public class BufferAndBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builderCity = new StringBuilder();
        builderCity.append("mumbai");
        System.out.println("builder city: " + builderCity);
        System.out.println("builder city.capacity(): " + builderCity.capacity());

        StringBuffer bufferCity = new StringBuffer();
        bufferCity.append("pune");
        System.out.println("buffer city: " + bufferCity);
        System.out.println("buffer city.capacity(): " + bufferCity.capacity());
    }
}
