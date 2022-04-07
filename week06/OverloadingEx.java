package week06;
class MethodSample{
	int overloadingEx(int i, int j) {
		return i + j;
	}
	int overloadingEx(int i, int j, int k) {
		return i + j + k;
	}
	double overloadingEx(double i, double j) {
		return i + j;
	}
	double overloadingEx(double i, int j) {
		return i + j;
	}
	double overloadingEx(int i, double j) {
		return i + j;
	}//메소드 오버로딩 - 시그니쳐가 다르면 같은 이름을 허용한다.
}
public class OverloadingEx {
	public static void main(String[] args) {

		MethodSample a = new MethodSample();
		
		int i = a.overloadingEx(1,2);
		System.out.println(i);
		int j = a.overloadingEx(1,2,3);
		System.out.println(j);
		double k = a.overloadingEx(1.1,2.2);
		System.out.println(k);
		double l = a.overloadingEx(1.1,2);
		System.out.println(l);
		double m = a.overloadingEx(1,2.2);
		System.out.println(m);
	}
}
