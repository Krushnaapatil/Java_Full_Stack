package ThreadEx;

class PrintValues extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(threadName + " is Running.");
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has finished successfully!");
    }
}

class PrintValues2 extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 10; i <= 13; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(threadName + " is Running.");
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has finished successfully!");
    }
}

public class MultiThreadEx {
    public static void main(String[] args) {
        PrintValues p = new PrintValues();
        PrintValues2 p2 = new PrintValues2();

        // Explicitly naming the threads to clearly differentiate them in the console
        p.setName("Thread-Alpha");
        p2.setName("Thread-Beta");

        // Starting both threads to run concurrently
        p.start();
        p2.start();
    }
}
