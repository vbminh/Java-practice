package OOP.Bai2;

public class Circle {
	private double radius;

	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	protected double getRadius() {
		return radius;
	}
	
	protected void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double Area() {
		return 3.14 * Math.pow(radius,2);
	}
	
	public double Perimeter() {
		return 2 * 3.14 * radius;
	}
}
