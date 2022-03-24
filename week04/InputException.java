package week04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " > > ");			
			try {
				n = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				sc.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은 :" + sum + "입니다.");
		sc.close();
	}
}
