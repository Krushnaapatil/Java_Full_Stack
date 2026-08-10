package ThreadEx;

class Account {
    private double balance = 5000.00;

    public synchronized void deposit(double amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is preparing to deposit Rupees " + amount);

        double newBalance = balance + amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        balance = newBalance;
        System.out.println(threadName + " completed! Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is preparing to withdraw Rupees " + amount);

        if (amount > balance) {
            System.out.println(threadName + " Rejected: Insufficient Funds!");
            return;
        }

        double newBalance = balance - amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        balance = newBalance;
        System.out.println(threadName + " completed! Current Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankExForSychNJoins {
    public static void main(String[] args) {
        System.out.println("--- Bank System Processing Initiated ---");

        Account sharedAccount = new Account();

        Thread atm1 = new Thread(() -> {
            sharedAccount.deposit(2000.00);
        }, "ATM-Mumbai-01");

        Thread atm2 = new Thread(() -> {
            sharedAccount.withdraw(3000.00);
        }, "ATM-Delhi-02");

        atm1.start();
        atm2.start();

        try {
            atm1.join();
            atm2.join();
        } catch (InterruptedException e) {
            System.out.println("Main processing pipeline interrupted.");
        }

        System.out.println("----------------------------------------");
        System.out.println("Final Verified Bank Statement Balance: " + sharedAccount.getBalance());
        System.out.println("--- Bank System Processing Closed ---");
    }
}

