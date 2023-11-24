package _05_class._final;

public class Circle {
	public static final double PI = Math.PI;	
	private final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		return radius * radius * PI;
	}
}
