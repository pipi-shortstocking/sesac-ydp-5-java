package _05_class._static;

public class StudentEx {

	public static void main(String[] args) {
		new Student("강백호", 202012, 1);
		Student.displayInfo();
		
		new Student("서태웅", 203412, 1);
		Student.displayInfo();
		
		new Student("정대만", 202342, 3);
		Student.displayInfo();
		
		System.out.println("\n총 학생의 수는 " + Student.getTotalStudents() + "명 입니다.");
	}

}
