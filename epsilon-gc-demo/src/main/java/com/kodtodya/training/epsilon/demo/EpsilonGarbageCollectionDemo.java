package com.kodtodya.training.epsilon.demo;

// this program helps us to demonstrate 
// Epsilon Garbage Collector
// Please use below 2 runtime switches on 
// command line or in VM arguments section of eclipse
// -XX:+UnlockExperimentalVMOptions 
// -XX:+UseEpsilonGC

// Expected output : without specifying above 2 switches,
// you can see that program completes successfully
// After specifying above 2 switches, you must observe 
// java.lang.OutOfMemoryError: Java heap space
public class EpsilonGarbageCollectionDemo {

	public static void main(String[] args) {
		final int GIGABYTE = 1024 * 1024 * 1024;
        final int ITERATIONS = 100;

        System.out.println("Starting allocations...");

        // allocate memory 1GB at a time
        for (int i = 0; i < ITERATIONS; i++) {
            var array = new byte[GIGABYTE];
        }

        System.out.println("Completed successfully");
    }

}
