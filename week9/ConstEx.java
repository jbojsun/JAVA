package week9;

class A {
    public A(){
        System.out.println("생성자 A");
    }
    public A(int a){
        super();
        System.out.println("생성자 Aa");
    }
}
class B extends A{
    public B(){
        System.out.println("생성자 B");
    }
    public B(int b){
        System.out.println("생성자 Bb");
    }
}
class C extends B{
    public C(){
        super(1);
        System.out.println("생성자 C");
    }
    public C(int c){
        super(2);
        System.out.println("생성자 Cc");
    }
}
public class ConstEx {
    public static void main(String[] args) {
        A a = new A(1);

        B b = new B(4);

        C c = new C();
        C Cc = new C(2);
    }
}