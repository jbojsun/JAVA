package week06;

class Stat{
	static int cnt = 0;
	int i = 5;
	public Stat() {
		cnt++;
	}
	public Stat(int i) {
		cnt++;
		this.i = i;
	}
	static int statMethod(){
		return cnt;
	}
}
public class StaticEx {
	public static void main(String[] args) {
		Stat s1 = new Stat();
		System.out.println(s1.cnt);
		Stat s2 = new Stat();
		System.out.println(s2.cnt);
		Stat s3 = new Stat(1);
		System.out.println(s3.cnt);
		Stat s4 = new Stat(2);
		System.out.println(s4.cnt);
		
		System.out.println(Stat.cnt);
		System.out.println(Stat.statMethod());
		System.out.println(Math.PI);
	}
}
