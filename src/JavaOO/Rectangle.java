package JavaOO;

public class Rectangle {

	double width;
	double height;
	
	public double area() {
		return width * height;	
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(height*height + width*width);
	}
}
