package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * An example demonstrating the use of a daemon thread in Java.
 * In Java, a daemon thread is a background thread that runs continuously in the background
 * and doesn't prevent the program from exiting if the main thread has completed its execution.
 * Daemon threads are typically used for tasks such as garbage collection, monitoring, or other background tasks.
 */
public class DaemonThreadExample {

    /**
     * The main method of the DaemonThreadExample class.
     * It creates a daemon thread, starts it, and demonstrates how the program can exit
     * even if the daemon thread is still running in the background.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Create a new thread and set it as a daemon thread
        Thread daemonThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    // Daemon thread task, e.g., continuous monitoring or background processing
                    System.out.println("Daemon thread is running...");
                    try {
                        Thread.sleep(1000); // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start(); // Start the daemon thread

        // Simulate the main thread doing some work
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting, and the daemon thread will be terminated automatically.");
    }
}
