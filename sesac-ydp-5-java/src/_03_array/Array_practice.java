package _03_array;

import java.util.Scanner;

public class Array_practice {

	public static void main(String[] args) {
		System.out.println("5개의 정수를 입력하세요 ");
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			avg += num;
		}
		
		System.out.println("평균은 " + (double)avg/arr.length);
		
	}

}
