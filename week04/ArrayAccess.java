package week04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int max = 0;
		int min = 214783647;
		int sum = 0;
		
		System.out.println("5개의 양의 정수를 입력하세요 :");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.println();
		for (int i : intArray) {
			System.out.println(i + " ");
		}
		System.out.println("가장 높은수는 : " + max);
		System.out.println("가장 낮은수는 : " + min);
		System.out.println("입력한 수의 합은 : " + sum);
		sc.close();
		
		
	}
}
