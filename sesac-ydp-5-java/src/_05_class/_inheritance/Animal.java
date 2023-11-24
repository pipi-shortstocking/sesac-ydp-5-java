package _05_class._inheritance;

public class Animal {
//	// 부모 클래스의 메소드 
//	void makeSound() {
//		System.out.println("동물이 운다");
//	}
	
	// 실습
	public String species;
	
	public Animal() {}
	
	public Animal(String species, String name, int age) {
		this.species = species;
		this.name = name;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String name;
	public int age;
	
	void makeSound() {
		System.out.println("동물이 소리를 낸다");
	}
}
