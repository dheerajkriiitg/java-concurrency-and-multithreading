package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * Below Lambda Implementation is used to implement the Runnable interface.
 */
public class ThreadExampleCreate4 {

    public static void main(String[] args) {

        // Lambda Implementation of the Runnable interface
        // This Lambda Implementation is possible because the Runnable interface only has a single unimplemented method,
        // and is therefore practically (although possibly unintentionally) a functional Java interface
        Runnable runnable = () -> { System.out.println("Lambda Runnable running"); };

        // When the thread is started, it will call the run() method of the Runnable instance instead of executing its own run() method.
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
