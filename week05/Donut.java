package week05;

public class Donut {
	int radius;
	String name;
	double getArea(int radius) {
		double area;
		area = 3.14 * radius * radius;
		return area;
	}
	public static void main(String[] args) {
		
		Donut pizza = new Donut();
		pizza.radius = 7;
		pizza.name = "자바피자2";
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea(pizza.radius));

		Donut donut = new Donut();
		donut.radius = 2;
		donut.name = "자바피자2";
		System.out.println(donut.name + "의 면적은 " + donut.getArea(donut.radius));
	}
}
