//package java_fullstack;
//
//class PaymentMethod {
//     void pay(int amount) {
//    	System.out.println("Pay Using Old Method");
//    } 
//}
//
//class UPI extends PaymentMethod {
//
//    void pay(int amount) {
//    	super.pay(amount);
//        System.out.println("Paid by UPI: " + amount);
//    }
//}
//
//class Card extends PaymentMethod {
//    void pay(int amount) {
//    	super.pay(amount);
//        System.out.println("Paid by Card: " + amount);
//    }
//}
//
//class Cash extends PaymentMethod {
//    void pay(int amount) {
//    	super.pay(amount);
//        System.out.println("Paid by Cash: " + amount);
//    }
//}
//
//public class Payment {
//    private PaymentMethod paymentMethod;
//
//    public Payment(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public void processBill(int amount) {
//        paymentMethod.pay(amount);
//    }
//
//    public static void main(String[] args) {
//        Cash userChoice = new Cash(); 
//        UPI upi = new UPI();
//        Card card = new Card();
//        
//        PaymentMethod[] arr = {userChoice, upi, card};
// 
//        for(PaymentMethod paymentMeth : arr) {
//        	paymentMeth.pay(2000);
//        }
////        payment.processBill(200);
//    }
//}
