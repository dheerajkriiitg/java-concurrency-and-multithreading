package com.example.javaconcurrencyandmultithreading.createStartStopThread;

/**
 * Stopping a Java Thread requires careful consideration of your thread implementation code.
 * The Java Thread class contains a stop() method, but it is deprecated. The original stop() method
 * would not provide any guarantees about in what state the thread was stopped. That means,
 * that all Java objects the thread had access to during execution would be left in an unknown state.
 * If other threads in your application also have access to the same objects, your application could fail unexpectedly and unpredictably.
 *
 * Instead of calling the stop() method, you need to implement your thread code so it can be stopped safely.
 * Here is an example of a class that implements Runnable which contains an extra method called doStop()
 * which signals to the Runnable to stop. The Runnable will check this signal and stop when it is ready to do so.
 */
public class ThreadExampleStop {

    /**
     * A Runnable implementation with a stop signal method.
     */
    public static class MyRunnable implements Runnable {
        private boolean doStop = false;

        /**
         * Signals the Runnable to stop.
         */
        public synchronized void doStop() {
            this.doStop = true;
        }

        /**
         * Checks if the Runnable should keep running.
         *
         * @return true if the Runnable should keep running, false otherwise.
         */
        private synchronized boolean keepRunning() {
            return !this.doStop;
        }

        @Override
        public void run() {
            while(keepRunning()) {
                // Keep doing what this thread should do.
                System.out.println("Running");

                try {
                    Thread.sleep(3L * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myRunnable.doStop();
    }
}
