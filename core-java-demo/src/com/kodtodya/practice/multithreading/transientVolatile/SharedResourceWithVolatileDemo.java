package com.kodtodya.practice.multithreading.transientVolatile;

class SharedResourceWithVolatileDemo {
    // The volatile keyword is used in the context of multithreading.
    // It ensures that a variable's value is always read from
    // and written to the main memory, making it visible to
    // all threads immediately. This prevents threads from caching
    // variables locally, which can lead to inconsistent views
    // of the variable's value.
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) {
            System.out.println("Continuously running thread.");
        }
        System.out.println("Thread stopped.");
    }

    public static void main(String[] args) throws InterruptedException {
        SharedResourceWithVolatileDemo resource = new SharedResourceWithVolatileDemo();

        Thread thread = new Thread(resource::run);
        thread.start();

        Thread.sleep(1000); // Let the thread run for a while
        resource.stop();    // Stop the thread
        thread.join();      // Wait for the thread to finish
    }
}
