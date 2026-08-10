package ThreadEx;

// 1. Implement the Runnable interface
class MyRunnableTask implements Runnable {

    // 2. Override the abstract run() method
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is executing step: " + i);

            try {
                // Pause for 500 milliseconds to simulate processing work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " task completed.");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // 3. Create an instance of your Runnable implementation class
        MyRunnableTask task = new MyRunnableTask();

        // 4. Pass the task object into a new Thread constructor
        Thread workerThread1 = new Thread(task);
        Thread workerThread2 = new Thread(task);

        // Optional: Give your threads explicit names for clean tracking
        workerThread1.setName("Worker-Alpha");
        workerThread2.setName("Worker-Beta");

        // 5. Invoke start() to launch the threads concurrently
        workerThread1.start();
        workerThread2.start();

        System.out.println("Main thread execution finished processing execution commands.");
    }
}

