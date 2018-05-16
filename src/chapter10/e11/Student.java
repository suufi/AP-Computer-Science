package chapter10.e11;

public class Student extends Person {

	private String major;
	
	public Student(String name, int yearOfBirth, String major) {
		super(name, yearOfBirth);
		this.major = major;
	}

	public String getMajor() {
		return this.major;
	}
	
	public String toString() {
		return "Student " + getName() + " was born " + getYearOfBirth() + " and majors in " + getMajor();
	}
}
