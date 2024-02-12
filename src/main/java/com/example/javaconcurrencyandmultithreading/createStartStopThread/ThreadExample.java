package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * When a Java application is started, its main() method is executed by the main thread -
 * a special thread that is created by the JVM to run your application. From inside
 * your application, you can create and start more threads which can execute parts of your
 * application code in parallel with the main thread.
 */
public class ThreadExample {
    public static void main(String[] args) {

        // This example doesn't specify any code for the thread to execute.
        // Therefore, the thread will stop again right away after it is started.
        // There are two ways to specify what code the thread should execute.
        // The first is to create a subclass of Thread and override the run() method.
        // The second method is to pass an object that implements Runnable (java.lang.Runnable) to the Thread constructor.
        System.out.println("ThreadExample.main");
        Thread thread = new Thread();
        thread.start();
    }
}
