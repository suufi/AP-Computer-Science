package chapter8.p1;

import java.util.Scanner;


public class PaycheckTester {

	public static void main(String[] args) {
		
		String name = "";
		int hoursWorked = 0;
		double wage = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the name of the employee? ");
		name = scanner.next();
		
		System.out.print("How many hours did they work? ");
		hoursWorked = scanner.nextInt();
		
		System.out.print("What's their wage? ");
		wage = scanner.nextDouble();
		
		scanner.close();
		
		Paycheck paycheck = new Paycheck(name, wage, hoursWorked);
		
		System.out.format("%s's gross pay is $%.2f and is taxed $%.2f. Their net pay is: $%.2f.", name, paycheck.calculateGrossPay(), paycheck.calculateTax(), paycheck.calculateNetPay());
		
	}

}