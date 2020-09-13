package main.inheritance;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(int side) {
		super(side, side);

	}

	int getSide() {
		return getLength();
	}

	public String toString() {
		String dimensions = "Side: " + getLength();
		return dimensions;
	}

	public static void main(String[] args) {
		Square s1 = new Square(3);

		System.out.println(s1.toString());
		int result = s1.getPerimeter(); 
		System.out.println("Perimeter: " + result);
		result = s1.getArea();
		System.out.println("Area: " + result);

	}

}
