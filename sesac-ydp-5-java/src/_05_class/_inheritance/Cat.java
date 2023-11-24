package _05_class._inheritance;

public class Cat extends Animal {
	public Cat() {
		setSpecies("고양이");
	}
	
	public Cat(String species, String name, int age) {
		super(species, name, age);
		setSpecies("고양이");
	}
	
	@Override
	public void makeSound() {
		System.out.println("야옹");
	}
	
	public void catCute() {
		System.out.println("고양이는 액체다");
	}
}
