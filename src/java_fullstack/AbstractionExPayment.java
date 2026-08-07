package java_fullstack;

//Abstract Parent Class
abstract class Payment {
 // Instance variables shared by all payment types
 double amount;
 String transactionId;

 // 1. Constructor: Initializes common payment data
 public Payment(double amount, String transactionId) {
     this.amount = amount;
     this.transactionId = transactionId;
 }

 // 2. Abstract Method: Every payment method must process money differently
 public abstract void processPayment();

 // 3. Concrete Method: Shared receipt logic used by all payment types
 public void printReceipt() {
     System.out.println("--- Receipt ---");
     System.out.println("TXN ID: " + transactionId);
     System.out.println("Amount: $" + amount);
     System.out.println("Status: Success\n");
 }
}

//Concrete Subclass 1: Credit Card
class CreditCardPayment extends Payment {
 String cardNumber;

 public CreditCardPayment(double amount, String transactionId, String cardNumber) {
     super(amount, transactionId); // Calls parent constructor
     this.cardNumber = cardNumber;
 }

 // Implementing the abstract method for Credit Cards
 @Override
 public void processPayment() {
     System.out.println("Connecting to Credit Card gateway...");
     System.out.println("Charging $" + amount + " to card ending in " + cardNumber.substring(cardNumber.length() - 4));
 }
}

//Concrete Subclass 2: UPI (or Digital Wallet)
class UpiPayment extends Payment {
 String upiId;

 public UpiPayment(double amount, String transactionId, String upiId) {
     super(amount, transactionId); // Calls parent constructor
     this.upiId = upiId;
 }

 // Implementing the abstract method for UPI
 @Override
 public void processPayment() {
     System.out.println("Sending collect request to UPI ID: " + upiId);
     System.out.println("Securely transferred $" + amount + " via bank server.");
 }
}


public class AbstractionExPayment {

	public class Main {
	 public static void main(String[] args) {
	     Payment cardTxn = new CreditCardPayment(150.50, "TXN98765", "1234567890123456");
	     cardTxn.processPayment();
	     cardTxn.printReceipt();

	     Payment upiTxn = new UpiPayment(45.00, "TXN11223", "user@bank");
	     upiTxn.processPayment();
	     upiTxn.printReceipt();
	 }
	}
}
