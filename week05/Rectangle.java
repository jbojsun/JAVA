package week05;

import java.util.Scanner;

public class Rectangle {
	
	private int width, height; //private defualt 
	int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle Rec = new Rectangle();
		
		System.out.print("높이 입력 : ");
		Rec.height = sc.nextInt();
		System.out.print("넓이 입력 : ");
		Rec.width = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + Rec.getArea());
		sc.close();
		
	}
	
}
