package week03;

import java.util.Iterator;
import java.util.Scanner;

public class ContinueEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수 5개를 입력하세요!!!");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번째 정수 : ",i+1);
			int num = sc.nextInt();
			if(num < 0)
				continue;
			sum += num;
		}
		System.out.println("입력한 양의 정수들의 합: " + sum);
	}
}

