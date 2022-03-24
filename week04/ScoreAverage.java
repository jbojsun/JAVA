package week04;

public class ScoreAverage {
	public static void testArr(double[][] abc)
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		double score[][] = { {4.5,4.0},
						   	{4.2,4.5},
						  	{4.4,4.3}};
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				sum += score[i][j];
			}
		}
		
		int n = score.length;
		int m = score[0].length;
		
		double avg = sum/(n*m);
		
		System.out.println("전체학점의 합은 : " + String.format("%.2f", sum) + "입니다.");
		System.out.println("평균 학점은 : " + String.format("%.2f", avg) + "입니다.");
		testArr(score);
	}
}
