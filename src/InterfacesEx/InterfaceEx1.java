package InterfacesEx;

interface PaymentProcessor {
 void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
 private String cardNumber;

 public CreditCardProcessor(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 @Override
 public void processPayment(double amount) {
     System.out.println("Charged $" + amount + " to Card " + cardNumber);
 }
}


class PayPalProcessor implements PaymentProcessor {
 private String email;

 public PayPalProcessor(String email) {
     this.email = email;
 }

 @Override
 public void processPayment(double amount) {
     System.out.println("Charged $" + amount + " via PayPal to " + email);
     System.out.println("***Payment Successful***");
 }
}

public class InterfaceEx1 {
		 public static void main(String[] args) {
		     PaymentProcessor payment1 = new CreditCardProcessor("4111-XXXX-XXXX-1111");
		     PaymentProcessor payment2 = new PayPalProcessor("patilkrushna222004@gmail.com");

		     payment1.processPayment(75.50);
		     payment2.processPayment(20.00);
		 }
}
