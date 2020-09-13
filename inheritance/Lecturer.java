package main.inheritance;

public class Lecturer extends UniversityPerson {
	
	String school;
	
	public Lecturer(String n, int a, String i, String s) {
		super(n, a ,i);
		school = s;
	}
	
	public String getSchool() {
		return school;
	}

}
