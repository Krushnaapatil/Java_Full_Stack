package ExceptionHandling;

class WithDrawException extends Exception {
    public WithDrawException(String message) {
        super(message);
    }
}

public class BankATMException {
    static int balance = 3000;
    static void ATM(int amount) throws WithDrawException {
        if (balance < amount) {
            throw new WithDrawException("WithDraw Denied: Amount is Greater than your Account Balance.");
        }
        System.out.println("Access Granted...");
        System.out.println("Withdraw Amount : " + amount);
        balance -= amount;
        System.out.println("Total Balance left : " + balance);
    }

    static void main(String[] args) {

        try {
            ATM(2000);
        } catch (WithDrawException e) {
            throw new RuntimeException(e);
        }
    }
}

