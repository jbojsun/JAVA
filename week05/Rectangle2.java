package week05;

import java.util.Scanner;

class Rect{
	private int width, height; 
	//private 접근조절자 접근하지못하도록 private을 선언
	//접근을 하려면 set,get을 사용하여 수정할 수 있도록 함
	
	public void setWidth(int width) {
		this.width = width;
	}//메소드를 만들어서 width, height에 접근가능하도록 하는
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	int getArea() {
		return width * height;
	}
}
public class Rectangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rect Rec = new Rect();
		
		System.out.print("높이 입력 : ");
		Rec.setWidth(sc.nextInt());
		//Rec.height = sc.nextInt();
		System.out.print("넓이 입력 : ");
		Rec.setHeight(sc.nextInt());
		//Rec.width = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + Rec.getArea());
		sc.close();
			
	}
}
