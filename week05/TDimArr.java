package week05;

public class TDimArr {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//1차원배열
		
		int[][] arr2 = new int[3][5];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
		}//2차원배열 
		
		int[][][] arr3 = new int[2][3][5];
		
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		System.out.println(arr3[0][0].length);
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				for (int k = 0; k < arr3[0][0].length; k++) {
					System.out.println(arr3[i][j][k] + " ");
				}System.out.println();
			}System.out.println();
		}//3차원배열 
	}
}
