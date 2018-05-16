package chapter10.e11;

public class Instructor extends Person {

	private double salary = 0;
	
	public Instructor(String name, int yearOfBirth, double salary) {
		super(name, yearOfBirth);
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return "Instructor " + getName() + " was born " + getYearOfBirth() + " and has a salary of $" + getSalary();
	}
}
