package chapter10.e2;

public class BankAccount {

	double balance = 0;
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
}
