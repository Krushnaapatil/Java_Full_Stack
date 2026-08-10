package ThreadEx;

// 1. Define the shared Counter class
class Counter {
    private int count = 0;

    // Use 'synchronized' to make this method thread-safe
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadCounterDemo {
    public static void main(String[] args) {
        // Create one single shared instance of Counter
        Counter sharedCounter = new Counter();

        // 2. Define a task that increments the counter 1000 times
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        };

        // 3. Create two separate threads working on the same task
        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish completely before reading the final value
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // 4. Print the final expected count (should be exactly 2000)
        System.out.println("Final Counter Value: " + sharedCounter.getCount());
    }
}
