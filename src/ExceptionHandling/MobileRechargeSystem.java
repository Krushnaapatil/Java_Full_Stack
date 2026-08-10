package ExceptionHandling;

class InvalidRechargeAmountException extends Exception {
    public InvalidRechargeAmountException(String message) {
        super(message);
    }
}

class Recharge {
    public void recharge(String mobileNumber, double amount) throws InvalidRechargeAmountException {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Recharge Amount: ₹" + amount);
        System.out.println("-----------------------------------");

        if (amount <= 0) {
            throw new InvalidRechargeAmountException("Invalid Recharge Amount");
        }

        System.out.println("Recharge of ₹" + amount + " successful for " + mobileNumber + "!");
    }
}

public class MobileRechargeSystem {
    public static void main(String[] args) {
        Recharge service = new Recharge();

        String mobile = "9876543210";
        double testAmount = -50.0;

        try {
            service.recharge(mobile, testAmount);
        } catch (InvalidRechargeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
