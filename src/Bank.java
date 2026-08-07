
public class Bank {
	int bankId = 1001;
	String address = "shahada, tal. sahahda, dist. nandurbar";
	int balance = 0;
		public Bank(int bankId, int balance) {
			this.address = address;
			this.bankId = bankId;
			this.balance = balance;
			
		}
		
		public void deposite(int amount) {
			balance += amount;
			System.out.println(balance);
		}
		public void withdraw(int amount) {
			if(amount<balance) {
				balance -= amount;
			}
		}
		
		public static void main(String[] args) {
			Bank bank = new Bank(1001, 2000);
			bank.deposite(3000);
		}
	
}