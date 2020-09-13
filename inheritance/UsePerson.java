package main.inheritance;

public class UsePerson {

	public static void main(String[] args) {
		
		Person mark = new Person("Mark Smith", 60);
		UniversityPerson jean = new UniversityPerson("Jean Bacon", 60, "Cambridge");
		Student bill = new Student("Bill Gates", 56, "Harvard", 3);
		Lecturer neil = new Lecturer("Neil Speirs", 55, "Newcastle", "Computing");
		
		System.out.println(mark);
		
		System.out.println(bill.getName() + " " + bill.getAge() + ", " + bill.getInstitution() 
		+ " - " + bill.getStage());
		System.out.println(neil.getName() + " " + neil.getAge() + ", " + neil.getInstitution()
		+ " - " + neil.getSchool());
		
		System.out.println();
		printHierarchy(bill);
	}

	private static void printHierarchy(Person p) {
		System.out.println(p.getName() + " is: " + p.getClass());
		System.out.println(p.getName() + " is a Lecturer: " + (p instanceof Lecturer));
		System.out.println(p.getName() + " is a Student: " + (p instanceof Student));
		System.out.println(p.getName() + " is a UniversityPerson: " + (p instanceof UniversityPerson));
		System.out.println(p.getName() + " is a Person: " + (p instanceof Person));
		System.out.println(p.getName() + " is an Object: " + (p instanceof Object));
	}


}


