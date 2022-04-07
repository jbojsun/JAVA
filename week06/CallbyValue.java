package week06;

public class CallbyValue {
	
	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println(n);
	}
	
	static void increase(int m) {
		m = m+1;
		System.out.println(m);
	}
	
}
