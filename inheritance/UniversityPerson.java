package main.inheritance;

public class UniversityPerson extends Person {
	
	private String institution;
	
	public UniversityPerson(String n, int a, String i) {
		super(n, a);
		institution = i;
		
	}
	
	public String getInstitution() {
		return institution;
	}

}
