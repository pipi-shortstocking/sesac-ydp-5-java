package _05_class._inheritance;

public class Dog extends Animal {
//	// 메소드 오버라이딩: 부모 클래스의 makeSound() 메소드 재정의 
//	@Override
//	void makeSound() {
//		System.out.println("멍멍!");
//	}
//	
////	 @Override
////	 void makeSound() {
////		 super.makeSound(); // 부모 클래스의 메소드 호출 
////	 }
//
//	void fetch() {
//		System.out.println("공 가져와!!");
//	}
	
	// 실습 
	public Dog() {
		setSpecies("강아지");
	}
	
	public Dog(String species, String name, int age) {
		super(species, name, age);
		setSpecies("강아지");
	}
	
	@Override
	public void makeSound() {
		System.out.println("멍멍!");
	}
	
	public void dogCute() {
		System.out.println("강아지는 귀엽다");
	}
}
