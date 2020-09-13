package main.inheritance;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Person p = new Person("Harry Potter", 18);
		UniversityPerson up = new UniversityPerson("Neville Longbottom", 25, "Hogwarts");
		Student s = new Student("Hermione Granger", 18, "HogWarts", 1);
		Lecturer lec = new Lecturer("Severus Snape", 45, "Hogwarts", "Potions");
		
	}

}
