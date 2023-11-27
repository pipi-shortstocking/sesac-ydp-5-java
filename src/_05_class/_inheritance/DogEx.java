package _05_class._inheritance;

public class DogEx {

	public static void main(String[] args) {
//		// 자식 클래스 인스턴스 생성 
//		Dog myDog = new Dog();
//		
//		// 메소드 호출: 오버라이딩 된 메소드 호출 
//		myDog.makeSound();
//		
//		// 자식 클래스의 일반 메소드 호출 
//		myDog.fetch();
		
		// 실습
		Animal ani = new Animal();
		
		ani.makeSound();
		
		System.out.println("---------------");
		
		Dog myDog = new Dog();
		myDog.setName("댕댕");
		myDog.setAge(10);
		
		System.out.println(myDog.getName() + "은 " + myDog.getAge() + "살, " + myDog.getSpecies() + "이다.");
		System.out.println("---------------");
		
		Cat myCat = new Cat();
		myCat.setName("냥냥");
		myCat.setAge(3);
		
		System.out.println(myCat.getName() + "은 " + myCat.getAge() + "살, " + myCat.getSpecies() + "이다.");
	}

}
