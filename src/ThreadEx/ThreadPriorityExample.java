package ThreadEx;

class PriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class PriorityThread2 extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
        }
    }
}

class PriorityThread3 extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        for (int i = 20; i < 30; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread2 t2 = new PriorityThread2();
        PriorityThread3 t3 = new PriorityThread3();

        t1.setName("Low-Priority-Thread");
        t2.setName("Normal-Priority-Thread");
        t3.setName("High-Priority-Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
