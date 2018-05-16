package chapter10.e11;

public class PersonTester {
	public static void main(String[] args) {
		Person john = new Person("John", 2000);
		System.out.println(john);
		
		Student adam = new Student("Adam", 2000, "Computer Science");
		System.out.println(adam);
		
		Instructor malan = new Instructor("David Malan", 1965, 100000);
		System.out.println(malan);
		
	}
}
