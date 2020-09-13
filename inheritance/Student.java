package main.inheritance;

public class Student extends UniversityPerson{
	
	int stage;
	
	public Student(String n, int a, String i, int s) {
		super(n, a, i);
		stage = s;
	}
	
	public int getStage() {
		return stage;
	}

}
