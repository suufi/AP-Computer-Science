package chapter10.e2;

public class TimeDepositAccount extends BankAccount {

	double interestRate;
	int numberOfMonths;
	
	public TimeDepositAccount(double interestRate, int numberOfMonths) {
		this.interestRate = interestRate;
		this.numberOfMonths = numberOfMonths;
	}
	
	public void addInterest() {
		numberOfMonths--;
	}
	
	public void withdraw(double amount) {
		if (numberOfMonths > 0) {
			this.balance = this.balance - amount - 20;
		}		
	}
	
}
