# Common Pitfall: Calling `run()` Instead of `start()`
When creating and starting a thread, a common mistake is to call the `run()` method of the `Thread` instead of `start()`, like below:

At first, you may not notice anything because the Runnable's run() method is executed as expected. However, it is NOT executed by the new thread you just created. Instead, the run() method is executed by the thread that created the thread. In other words, the thread that executed the two lines of code.

To have the run() method of the MyRunnable instance called by the newly created thread, newThread, you MUST call the newThread.start() method.



```java
Thread newThread = new Thread(MyRunnable());
newThread.run();  // should be start();
