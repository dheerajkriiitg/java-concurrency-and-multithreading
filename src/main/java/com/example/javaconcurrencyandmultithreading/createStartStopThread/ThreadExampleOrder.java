package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * The Thread.currentThread() method returns a reference to the Thread instance executing currentThread().
 * This way, you can get access to the Java Thread object representing the thread executing a given block of code.
 */
public class ThreadExampleOrder {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // Note that even if the threads are started in sequence (1, 2, 3, etc.), they may not execute sequentially,
        // meaning thread 1 may not be the first thread to write its name to System.out.
        // This is because the threads are in principle executing in parallel and not sequentially.
        // The JVM and/or operating system determine the order in which the threads are executed.
        // This order does not have to be the same order in which they were started.
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }
    }
}
