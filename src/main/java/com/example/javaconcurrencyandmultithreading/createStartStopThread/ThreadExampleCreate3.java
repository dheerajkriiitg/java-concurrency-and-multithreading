package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * Below anonymous class is used to implement the Runnable interface.
 */
public class ThreadExampleCreate3 {

    public static void main(String[] args) {

        // anonymous class
        Runnable runnable =
                new Runnable(){
                    public void run(){
                        System.out.println("Runnable running");
                    }
                };

        // When the thread is started, it will call the run() method of the Runnable instance instead of executing its own run() method.
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
