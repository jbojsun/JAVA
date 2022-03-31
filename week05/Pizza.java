package week05;

class Circle{

	int radius;
	String name;
	//method overloading 매개변수의 타입, 개수, 위치	시그니처
	//위치가 다르면 여러개의 메소드 선언 (객체지향언어에서는)
	//생성자의 목적은 리턴값
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public Circle(int radius, String name) {
		
		this.radius = radius; //this(radius);
		this.name = name;	  
	}
	
	
	double getArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}
public class Pizza {
	public static void main(String[] args) {
		
		Circle pizza = new Circle(5);
		pizza.name = "자바피자";
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea(pizza.radius));
		
		Circle donut = new Circle(2,"원통");
		System.out.println(donut.name + "의 면적은 " + donut.getArea(donut.radius));
		
	}
}
