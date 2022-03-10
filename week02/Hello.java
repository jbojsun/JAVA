package week02;

public class Hello {
	public static int sum(int n, int m) {
		return n + m;
	}
	public static void main(String[] args) {
		int i = 20, j = 024, k = 0x14, l = 0b10100;
		boolean c = true;
		int num;
		char a;
		boolean b;
		b =(boolean)c;
		
		num = sum(i,10);
		a = '?';
		
		
		System.out.println(num);
		System.out.println("Hello");
		System.out.println(a);
		System.out.println("i="+i+", j="+j+", k="+k+ ", l="+l);
		System.out.print(b);
	}
}
