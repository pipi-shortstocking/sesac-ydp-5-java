package _05_class;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		ArrayList<Rectangle> rec_arr = new ArrayList<>();
		int width = 1;
		int height = 1;
		
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요. ");
			
			width = sc.nextInt();
			height = sc.nextInt();
			
			if(width == 0 && height == 0) {
				break;
			}
			
			Rectangle rec = new Rectangle(width);
			rec.setHeight(height);
			rec_arr.add(rec);
		}
		
		for(Rectangle r : rec_arr) {
			System.out.println("가로 길이는: " + r.getWidth());
			System.out.println("세로 길이는: " + r.getHeight());
			System.out.println("넓이는: " + r.area(r.getWidth(), r.getHeight()));
			System.out.println("------------------------");
		}
		System.out.println("Rectangle 인스턴스의 개수는: " + rec_arr.size());
	}

}
