package main.inheritance;

public class Rectangle {

	private int width;
	private int length;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle() {
		width = 2;
		length = 4;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getArea() {
		int area = width * length;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter = width + width + length + length;
		return perimeter;
	}
	
	public String toString() {
		String dimensions = "Width: " + this.getWidth() + " Length: " + this.getLength();
		return dimensions;
	}
	

}
