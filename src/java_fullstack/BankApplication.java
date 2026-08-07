package java_fullstack;

class Bank2 {
	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	private double Balance = 1000;
	public void withDraw (int amount) {
		if (amount< Balance) {
			Balance -= amount;
			System.out.println("Balance remain : " + Balance);
		}
	}
	
	public void deposite (int amount) {
		Balance += amount;
		System.out.println("Total Balance : " + Balance);
	}
}

class Upi{
	Bank2 bank2 = new Bank2();
	void show() {
		bank2.deposite(2000);
	}
}

class Atm{
	Bank2 bank2 = new Bank2();
	void show() {
		bank2.deposite(2000);
	}
}

public class BankApplication {
	public static void main(String[] a) {
	Upi upi = new Upi();
	upi.show();
	Atm atm = new Atm();
	atm.show();
	Bank2 bank2 = new Bank2();
	System.out.println(bank2.getBalance());
	}
}
