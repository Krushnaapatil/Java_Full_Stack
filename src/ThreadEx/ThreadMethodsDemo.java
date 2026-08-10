package ThreadEx;

// 1. Define the task by implementing the Runnable interface
class ProcessingTask implements Runnable {
    @Override
    public void run() {
        // Get the name of the currently running thread
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " has started downloading files...");

        for (int i = 1; i <= 3; i++) {
            try {
                // 2. Using sleep() to simulate time-consuming work
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
                System.out.println(threadName + " is downloading: Part " + i + "/3");
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has finished downloading successfully!");
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Main thread execution begins.");

        // Create the runnable task object
        ProcessingTask task = new ProcessingTask();

        // Create thread instances and assign custom names to them
        Thread thread1 = new Thread(task, "Download-Thread-1");
        Thread thread2 = new Thread(task, "Download-Thread-2");

        // 3. Using start() to begin concurrent execution
        thread1.start();
        thread2.start();

        try {
            // 4. Using join() to force 'main' to wait until these threads finish
            System.out.println("Main thread is waiting for background threads to complete...");
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }


//        System.out.println(Thread.currentThread().getName());

        // This line will only execute AFTER thread1 and thread2 are completely finished
        System.out.println("Main thread execution ends. All files are fully downloaded!");
    }
}
