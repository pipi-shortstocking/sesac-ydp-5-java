package _05_class._abstract;

public class ShapeEx {

	public static void main(String[] args) {
//		Circle c = new Circle("blue");
//		Square s = new Square("yellow");
		
		Circle c = new Circle("Red", "Circle");
		c.setRadius(5);
		Square s = new Square("Blue", "Rectangle");
		s.setHeight(6);
		s.setWidth(4);
		
//		c.start();
//		c.draw(); // 추상 메소드의 구현 
//		System.out.println("원의 색상은 " + c.getColor());
//		
//		s.start();
//		s.draw(); // 추상 메소드의 구현
//		System.out.println("사각의 색상은 " + s.getColor());
		
		System.out.printf("=== %s 도형의 정보 ===\n", c.getType());
		System.out.printf("도형의 색상: %s\n", c.getColor());
		System.out.printf("도형의 넓이: %s\n", c.calculateArea());
		
		System.out.println();
		
		System.out.printf("=== %s 도형의 정보 ===\n", s.getType());
		System.out.printf("도형의 색상: %s\n", s.getColor());
		System.out.printf("도형의 넓이: %s\n", s.calculateArea());
	}

}
