package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_practice {

	public static void main(String[] args) {
		List<Test> test = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		while(true) {
			System.out.println("문자를 입력해주세요. : ");
			input = sc.nextLine();	
			
			if(input.equals("exit")) {
				break;
			} else {
				test.add(new Test(input));	
			}
			
		}
		
		for(Test t : test) {
			System.out.println(t);
		}
		
	}

}

class Test {
	// 필드
	private String text;
	
	// 생성자 
	public Test(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	
	@Override
	public String toString() {
		return text;
	}
}
