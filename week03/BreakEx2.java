package week03;

import java.util.Iterator;
import java.util.Scanner;

public class BreakEx2 {
	public static void main(String[] args) {
		abc:
		for (int i = 0; i < 10; i++) {
			def:
			for (int j = 0; j < 10; j++) {
				if(i+j == 6)
					break abc;
				System.out.println("i = " + i + " j = "+ j);
			}
			
		}
	}
}
