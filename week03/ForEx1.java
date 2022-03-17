package week03;

public class ForEx1 {
	public static void main(String[] args) {		
		int i, sum = 0;
		for(i =1; i <=5; i+=2) {
			sum +=i;
			System.out.print(i);
			
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
	}
}
