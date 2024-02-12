package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * An example demonstrating how to join a Java thread and wait for it to terminate.
 * In Java, the join() method is used to wait for a thread to terminate its execution.
 * This is useful when one thread needs to wait for another thread to complete its task
 * before proceeding further.
 */
public class ThreadJoinExample {

    /**
     * The main method of the ThreadJoinExample class.
     * It creates a worker thread, starts it, and waits for it to complete using the join() method.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Create a worker thread
        Thread workerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Simulate some work by the worker thread
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Worker thread is working: " + i);
                    try {
                        Thread.sleep(1000); // Simulate some work by sleeping for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Start the worker thread
        workerThread.start();

        try {
            // Main thread waits for the worker thread to complete its execution using join()
            // The join() method causes the current thread (in this case, the main thread) to pause
            // execution until the thread on which it's called (in this case, the worker thread) terminates.
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This code block is executed after the worker thread completes its execution
        System.out.println("Worker thread has finished its task. Main thread continues.");
    }
}
