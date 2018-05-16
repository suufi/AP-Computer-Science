package chapter10.e12;

public class Executive extends Manager {
	
	public Executive(String name, double salary, String department) {
		super(name, salary, department);
	}
	
	public String toString() {
		return "Executive " + getName() + " makes $" + getSalary() + " and manages the " + getDepartment() + " department.";
	}
}
