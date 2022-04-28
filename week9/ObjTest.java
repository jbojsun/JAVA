package week9;

class D {
    int a, b, c;
    String name;

    public D() {
    }

    public D(int a) {
        this.a = a;
        //매개변수 구분
    }
    public D(int a, int b){
        this(a);
        //생성자내에서 생성자 지정
        //부모의 필드를 지정할때는 super.
        //
        //자기자신의 필드, 생성자
        //this.a = a;
        this.b = b;
    }
    public  D(int a, int b, int c){
        this(a,b);
        this.c = c;
    }
}
public class ObjTest{
    public static void main(String[] args) {
        D d = new D(1, 2, 3);
    }
}
