package week02;

import java.util.Scanner;

public class Inputscn {
	public static void main(String[] args) {
		int a;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번:");
		a = sc.nextInt();
		
		System.out.print("이름:");
		name = sc.next();
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close();
	}
}
