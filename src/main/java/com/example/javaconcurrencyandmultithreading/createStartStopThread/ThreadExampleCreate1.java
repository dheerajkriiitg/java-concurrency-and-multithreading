package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * The first way to specify what code a thread is to run, is to create a subclass of Thread and override the run() method.
 * The run() method is what is executed by the thread after you call start().
 */
public class ThreadExampleCreate1 {

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // The start() call will return as soon as the thread is started. It will not wait until the run() method is done. The run() method will execute as if executed by a different CPU.
    }
}
