package _02_control_statement;

import java.util.Scanner;

public class Method_practice {

	public static void main(String[] args) {
		Method_practice ol = new Method_practice();
		
		System.out.println("숫자 두 개를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("덧셈 결과 : " + ol.add(x,y));
		System.out.println("뺄셈 결과 : " + ol.sub(x, y));
		System.out.println("나눗셈 결과 : " + ol.dis(x, y));
		System.out.println("덧셈 결과 : " + ol.mul(x, y));
		
		double radius = 5;
		int width = 4;
		int height = 7;
		int width2 = 6;
		int height2 = 3;
		
		System.out.println("반지름이 " + radius + "인 원의 넓이: " + ol.test(radius));
		System.out.println("가로 " + width + ", 세로 " + height + "인 직사각형의 넓이: " + ol.test(width, height));
		System.out.println("밑변 " + width2 + ", 높이 " + height2 + "인 삼각형의 넓이: " + ol.test(width2, height2, 2));
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public double sub(double x, double y) {
		return x - y;
	}
	
	public double dis(double x, double y) {
		return x / y;
	}
	
	public double mul(double x, double y) {
		return x * y;
	}
	
	public double test(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double test(int width, int height) {
		return width * height;
	}
	
	public double test(int width1, int height2, int num) {
		return width1 * height2 / num;
	}

}
