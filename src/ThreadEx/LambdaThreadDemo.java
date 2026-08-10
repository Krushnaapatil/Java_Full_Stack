package ThreadEx;

public class LambdaThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // Create and define the Runnable task directly using a Lambda Expression
        Runnable lambdaTask = () -> {
            String threadName = Thread.currentThread().getName();

            for (int i = 1; i <= 3; i++) {
                System.out.println(threadName + " processing step: " + i);
                try {
                    Thread.sleep(500); // Pause for half a second
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted.");
                }
            }
            System.out.println(threadName + " completed.");
        };

        // Pass the lambda runnable directly into the Thread constructors
        Thread thread1 = new Thread(lambdaTask, "Lambda-Worker-1");
        Thread thread2 = new Thread(lambdaTask, "Lambda-Worker-2");

        // Start the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread code execution finished.");
    }
}

