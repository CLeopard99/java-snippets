package main.inheritance;

public class UsePersonOverriding {

	public static void main(String[] args) {
		Person p = new Person("Fred", 21);
		Student s = new Student("Fiona", 20, "Newcastle", 1);

		p.printDetails();
		s.printDetails();

		// p = s; // Assign Student to Person reference

		// p.printDetails();
	}
}
