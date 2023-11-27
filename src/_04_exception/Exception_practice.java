package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exception_practice {

	public static void main(String[] args) {
		// 실습 1
//		int[] arr = {1,2,3,4};
//		
//		try {
//			for(int i = 0; i <= 5; i++) {
//				System.out.println(arr[i]);
//			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("인덱스가 범위를 벗어났습니다. ");
//		}
		
		// 실습 2
//		System.out.println("배열 크기를 입력하세요 ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();		
//		int[] arr = new int[size];
//		int avg = 0;
//		int number;
//		
//		for(int i = 0 ;i < size; i++) {
//			System.out.println("배열 요소를 입력하세요 ");
//			number = sc.nextInt();
//			arr[i] = number;
//		}
//		
//		try {
//			for(int num : arr) {
//				avg += num;
//			}
//			System.out.println("평균 : " + (double) avg/size);
//		} catch (ArithmeticException e) {
//			System.out.println("에러 발생 >> ");
//		} catch (ArrayIndexOutOfBoundsException e) {			
//			System.out.println("에러 발생 >> " + e.toString());
//		} catch(InputMismatchException e) {
//			System.out.println("에러 발생 >> " + e.toString());
//		}
		
		// 실습 3
		System.out.print("배열 크기를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		int size1 = sc1.nextInt();
		int num;
		
		List<Integer> arr1 = new ArrayList<>();
		
		for(int i = 0 ;i < size1; i++) {
			System.out.println("배열 요소를 입력하세요 ");
			num = sc1.nextInt();
			arr1.add(num);
		}
		
		
		
		
	}

}
