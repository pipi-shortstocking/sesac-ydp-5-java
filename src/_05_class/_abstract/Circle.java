package _05_class._abstract;

//구체적인 클래스 - 도형 (원)

public class Circle extends Shape{
	int radius;
	
	public Circle(String color, String type) {
		super(color, type);
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 추상 메소드 구현 
	void draw() {
		System.out.println("원을 그리는 중입니다...");
	}
	
	double calculateArea() {
		return radius * radius * Math.PI;
	}
}
