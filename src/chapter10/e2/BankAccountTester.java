package chapter10.e2;

public class BankAccountTester {

	public static void main(String[] args) {
		TimeDepositAccount accountOne = new TimeDepositAccount(0.10, 36);
		accountOne.deposit(40000);
		
		System.out.printf("Account 1's balance is: $%.2f.", accountOne.getBalance());
		
		System.out.println();
		
		accountOne.withdraw(39000);
		System.out.printf("$39,000 was deducted from account 1 prematurely.\n There is a $20 penalty. The account's balance is now: $%.2f", accountOne.getBalance());
	}

}
