package week04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		double sum = 0.0;
		
		System.out.println("5개의 정수를 입력하세요. : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}
		
		System.out.println("평균값 : " + sum/intArray.length);
		sc.close();
	}
}
