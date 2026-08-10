package ExceptionHandling;

class Bank {
    private void withDraw() throws Exception{
        System.out.println("WithDrawing the Amount..");
    }

    void ATM() throws Exception{
        System.out.println("ATM is Processing...");
        withDraw();
    }

    void bank(int amount) throws Exception{
        System.out.println("Bank Server is Connecting...");
        ATM();
    }
}

public class BankEx {
    static void main() {
        Bank bank = new Bank();
        try {
            bank.bank(3000);
        } catch (Exception e) {
            System.out.println("Exception Handled " + e.getMessage());
        }
    }
}
