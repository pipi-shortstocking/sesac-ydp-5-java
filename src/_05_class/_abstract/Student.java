package _05_class._abstract;

public abstract class Student {
	String name;
	String school;
	int age;
	int id;

	public Student(String name, String school, int age, int id) {
		this.name = name;
		this.school = school;
		this.age = age;
		this.id = id;
	}
	
	abstract void todo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
