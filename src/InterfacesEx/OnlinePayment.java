package InterfacesEx;

interface Payment {
	void pay(double amount);
	void generateReceipt();
	default void paymentMode() {
		System.out.println("Payment Mode: UPI");
	}
}

public class OnlinePayment {

	public static void main(String[] args) {
		Payment payment = new Payment() {
			
			@Override
			public void pay(double amount) {
				System.out.println("Paid ₹" + amount + " Successfully");
			}
			
			@Override
			public void generateReceipt() {
				System.out.println("Receipt Generated");
			}
		};
		
		payment.paymentMode();
		payment.pay(3000);
		payment.generateReceipt();
	}

}
