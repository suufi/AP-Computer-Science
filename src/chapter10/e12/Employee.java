package chapter10.e12;

public class Employee {

	private String name = "";
	private double salary = 0;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return "Employee " + getName() + " makes $" + getSalary();
	}
}
