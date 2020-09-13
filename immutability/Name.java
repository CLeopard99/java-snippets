package main.immutability;

public class Name {

	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		if (firstName.length() == 0) {
			throw new IllegalArgumentException("Empty first name");
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		if (lastName.length() == 0) {
			throw new IllegalArgumentException("Empty last name");
		}
		this.lastName = lastName;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Name)) {
			return false;
		}
		final Name name = (Name) obj;
		return firstName.equals(name.firstName) && lastName.equals(name.lastName);
	}
	
	public int hashCode() {
		int hc = 17;
		
		hc = 31 * hc + firstName.hashCode();
		return 31 * hc + lastName.hashCode();
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public static Name valueOf(String name) {
		final String[] parts = name.split(" ");
		return new Name(parts[0], parts[1]);
	}

}
