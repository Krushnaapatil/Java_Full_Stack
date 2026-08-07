package InterfacesEx;

interface BankAccount {
	void deposit(double amount);
	void withdraw(double amount);
	default void accountType() {
		System.out.println("Savings Account");
	}
}

public class BankAccountSystem {

	public static void main(String[] args) {
		
		BankAccount unionAccount = new BankAccount() {
			
			@Override
			public void withdraw(double amount) {
				System.out.println("Amount Withdrawn: "+ amount);
			}
			
			@Override
			public void deposit(double amount) {
				System.out.println("Amount Deposited: "+ amount);
			}
		};
		
		unionAccount.accountType();
		unionAccount.deposit(23000.00);
		unionAccount.withdraw(3000.50);
		
	}

}
