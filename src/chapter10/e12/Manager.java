package chapter10.e12;

public class Manager extends Employee {

	private String department = "";
	
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}
	
	public String toString() {
		return "Manager " + getName() + " makes $" + getSalary() + " and manages the " + getDepartment() + " department.";
	}
}
