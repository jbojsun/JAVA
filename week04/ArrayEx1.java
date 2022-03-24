package week04;

public class ArrayEx1 {
	public static void main(String[] args) {
		
		int[] ArrayInt0 = new int[5];
		
		for (int i = 0; i < ArrayInt0.length; i++) {
			ArrayInt0[i] = i *10;
		}
		for (int i = 0; i < ArrayInt0.length; i++) {
			System.out.println(ArrayInt0[i]);
		}
		
		
		int[] ArrayInt2 = {1,2,3,4,5};
		for (int i : ArrayInt2) {
			System.out.println(i);
		}
		
		int[] ArrayInt3 = ArrayInt2;
		for (int i = 0; i < ArrayInt3.length; i++) {
			System.out.println(i);
		}
	}
}
