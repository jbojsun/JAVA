package week03;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� ����˴ϴ�.");
		
//		while(true){
//			System.out.print(">>");
//			String txt = sc.next();
//			if(txt.equals("exit")) {
//				break;
//			}
		for(;;){
			System.out.print(">>");
			String txt = sc.next();
			if(txt.equals("exit")) {
				break;
			}	
		System.out.println("�����մϴ�.");
		}
	}
}
