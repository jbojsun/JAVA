package week04;

public class ArrayCall {
	public static int sum(int def[], int n) {
		
		int sum = 0;
		def[++n] = 100;
				
		for (int i = 0; i < def.length; i++) {
			sum += def[i];
		}
		return sum;
	} 
	
	//call by value - 값을 주기 때문에 결과값에 영향을 주지않는다?
	//call by reference - 주소를 주기 때문에 결과값에 영향을 준다.
	
	public static void main(String[] args) {
		int[] abc = {99,89,96,87,99};
		int k=3;
		int hap = sum(abc,k);
		
		for (int i : abc) {
			System.out.println(i);
		}
	}
}
