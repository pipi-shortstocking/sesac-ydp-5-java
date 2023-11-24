package _05_class._static;

public class Student {
	private static String name;
	private static int studentId;
	private static int grade;
	
	static int totalStudents = 0;
	
	public Student(String name, int studentId, int grade) {
		Student.name = name;
		Student.studentId = studentId;
		Student.grade = grade;
		Student.totalStudents ++;
	}

	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		Student.name = name;
	}
	
	public static int getStudentId() {
		return studentId;
	}
	
	public static void setStudentId(int studentId) {
		Student.studentId = studentId;
	}
	
	public static int getGrade() {
		return grade;
	}
	
	public static void setGrade(int grade) {
		Student.grade = grade;
	}
	
	public static int getTotalStudents() {
		return totalStudents;
	}
	
	public static void displayInfo() {
		System.out.println("=== 학생 정보 ===");
		System.out.println("이름: " + getName());
		System.out.println("학번: " + getStudentId());
		System.out.println("학년: " + getGrade());
	}
	
}
