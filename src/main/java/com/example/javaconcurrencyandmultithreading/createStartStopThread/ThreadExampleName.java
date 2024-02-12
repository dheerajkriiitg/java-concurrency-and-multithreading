package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * A class to demonstrate creating and starting threads with names in Java.
 */
public class ThreadExampleName {

    public static void main(String[] args) {

        // Thread created using anonymous sub-class of Thread class
        Thread thread1 = new Thread("New sub-class Thread") {
            public void run() {
                System.out.println("run by: " + getName());
            }
        };

        thread1.start();
        System.out.println(thread1.getName());

        // Thread created using anonymous implementation of Runnable Interface
        // Since the MyRunnable class is not a subclass of Thread,
        // it does not have access to the getName() method of the thread executing it.
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Runnable running");
            }
        };

        Thread thread2 = new Thread(runnable, "New runnable Thread");
        thread2.start();
        System.out.println(thread2.getName());
    }
}
