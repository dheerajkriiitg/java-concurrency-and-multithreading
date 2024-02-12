package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * The second way to specify what code a thread should run is by creating a class that implements the java.lang.Runnable interface.
 * A Java object that implements the Runnable interface can be executed by a Java Thread.
 * The Runnable interface only has a single method run().
 * Whatever the thread is supposed to do when it executes must be included in the implementation of the run() method.
 * There are three ways to implement the Runnable interface:
 *   1. Create a Java class that implements the Runnable interface.
 *   2. Create an anonymous class that implements the Runnable interface.
 *   3. Create a Java Lambda that implements the Runnable interface.
 * Below java class is used to implement the Runnable interface.
 */
public class ThreadExampleCreate2 {

    public static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("MyRunnable running");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();

        // To have the run() method executed by a thread, pass an instance of a class, anonymous class or lambda expression that implements the Runnable interface to a Thread in its constructor
        // When the thread is started it will call the run() method of the MyRunnable instance instead of executing it's own run() method.
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
