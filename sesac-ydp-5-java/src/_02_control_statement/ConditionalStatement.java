package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// if ~ else 문
		int number = 10;
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// String 객체 비교 
		System.out.println("이름을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine(); // 엔터 이전까지의 문자열 읽음 
		System.out.println("name 값 확인 : " + name);
		
		// BAD
		if(name == "김새싹") { // "김새싹"을 올바르게 입력해도 else 절로 넘어감 
			System.out.println("환영합니다!");
		} else {
			System.out.println("이름을 다시 확인해주세요!");
		}
		
		// GOOD
		if(name.equals("김새싹")) { // "김새싹"을 올바르게 입력해도 else 절로 넘어감 
			System.out.println("*환영합니다!");
		} else {
			System.out.println("*이름을 다시 확인해주세요!");
		}
		
		// WHY?
		// - "==" 연산자: 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인) 
		// - ".equals()" 메소드: 두 객체의 "내용"이 동일한지 비교  
		
		// "문자열 리터럴" 경우, Java 특별히 취급. 동일한 문자열 리터럴이 사용될 경우,
		// Java 특별히 취급. 동일한 문자열 리터럴이 사용될 경우, 같은 참조를 가리킨다 
		String str1 = "hello";
		String str2 = "hello";
		
		if(str1 == str2) {
			System.out.println("같은 참조를 가리킵니다"); // 출력  
		} else {
			System.out.println("다른 참조를 가리킵니다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("내용이 같다"); // 출력  
		} else {
			System.out.println("내용이 다르다");
		}
		
		// 문자열 "동적 할당" 'new String()'을 이용해 새로운 문자열 객체를 만드는 경우 
		// new 연산자로 각각의 객체를 생성 (str3, str4). str3, str4는 서로 다른 객체 
		// '==' 연산자로 비교시 false 
		// .equals() 메소드로 비교시 true
		String str3 = new String("hi");
		String str4 = new String("hi");
		
		if(str3 == str4) {
			System.out.println("같은 참조를 가리킵니다"); 
		} else {
			System.out.println("다른 참조를 가리킵니다"); // 출력 
		}
		
		if(str3.equals(str4)) {
			System.out.println("내용이 같다"); // 출력 
		} else {
			System.out.println("내용이 다르다");
		}
		
		// if ~ else if 문 
		if(number % 3 == 0) {
			System.out.println("3의 배수");
		} else if (number % 5 == 0) {
			System.out.println("5의 배수");
		} else {
			System.out.println("3의 배수도 5의 배수도 아님 ");
		}
		
		// switch ~ case 문
		String dayOfWeek; // 요일
		int day = 10;
		
		switch (day) {
		case 1: 
			dayOfWeek = "일요일 ";
			break;
		case 2:			
			dayOfWeek = "월요일 ";
			break;
		case 3:
			dayOfWeek = "화요일 ";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			dayOfWeek = "수~토요일 ";
			break;
		default:
			dayOfWeek ="잘못된 입력";
			break;
		}
		System.out.println(dayOfWeek + "입니다!" );
		
	}

}
