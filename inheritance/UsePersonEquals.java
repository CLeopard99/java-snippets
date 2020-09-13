package main.inheritance;

public class UsePersonEquals {

	
	public static void main(String[] args) {
		
		String s = new String("Neil");
		System.out.println(s.hashCode());
		
		final Person n1 = new Person("Neil", 55);
		final Person n2 = new Person("Neil", 55);
		
		System.out.println(n1);
		
		System.out.println("n1 == n2: " + (n1 == n2));
		System.out.println("n1.equals(n2): " + n1.equals(n2));
		
		final Person n3 = new UniversityPerson("Neil", 55, "Newcastle");
		
		System.out.println("n1.equals(n3): " + n1.equals(n3));
		System.out.println("n3.equals(n1): " + n3.equals(n1));
		
		System.out.println("n1.equals(n2): " + n1.equals(n2));
		System.out.println("n1.hashCode() == n2.hashCode(): " + (n1.hashCode() == n2.hashCode()));
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
	}
}
