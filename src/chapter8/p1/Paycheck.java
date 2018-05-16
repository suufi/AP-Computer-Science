package chapter8.p1;

public class Paycheck {
	String fullName;
	double hourlyWage;
	int hoursWorked;
	final double SS_TAX = .062;
	double INCOME_TAX = 0.10;
	
	public Paycheck(String fullName, double hourlyWage, int hoursWorked) {
		this.fullName = fullName;
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public double calculateGrossPay() {
		double grossPay = hourlyWage * hoursWorked;
		return grossPay;
	}
	public double calculateTax() {
		double grossPay = this.calculateGrossPay();
		double annualPay = grossPay * 40 * 52;
		
		if (annualPay > 9275 && annualPay < 37650) {
			INCOME_TAX = .15;
		} else if (annualPay > 37650 && annualPay < 91150) {
			INCOME_TAX = .25;
		} else if (annualPay > 91150 && annualPay < 190150) {
			INCOME_TAX = .28;
		}
		
		return (grossPay * SS_TAX) + (grossPay * INCOME_TAX);
	}
	
	public double calculateNetPay() {
		double grossPay = this.calculateGrossPay();
		double taxes = this.calculateTax();
		
		return grossPay - taxes;
	}
}
