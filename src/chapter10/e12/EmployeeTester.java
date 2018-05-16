package chapter10.e12;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee john = new Employee("John", 35231);
		System.out.println(john);
		
		Manager adam = new Manager("Adam", 80000, "Sales");
		System.out.println(adam);
		
		Executive malan = new Executive("David Malan", 210000, "Technical");
		System.out.println(malan);
		
	}
}
