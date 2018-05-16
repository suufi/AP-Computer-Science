package chapter10.e11;

public class Person {

	private String name = "";
	private int yearOfBirth = 0;
	
	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getYearOfBirth() {
		return this.yearOfBirth;
	}
	
	public String toString() {
		return "Person" + getName() + " was born in " + getYearOfBirth();
	}
}
