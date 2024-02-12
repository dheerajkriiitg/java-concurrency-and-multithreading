package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * A class to demonstrate pausing a thread using Thread.sleep() method.
 * The sleep() method will attempt to pause execution for a specified number of milliseconds.
 * It may throw InterruptedException when the thread is interrupted while sleeping.
 */
public class ThreadExamplePause {

    public static void main(String[] args) {

        // Thread created using anonymous sub-class of Thread class
        Thread thread1 = new Thread("New sub-class Thread") {
            public void run() {
                System.out.println("run by: " + getName());
                try {
                    // Pause the thread for 1000 milliseconds (1 second)
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finished");
            }
        };

        thread1.start();
        System.out.println(thread1.getName());
    }
}
