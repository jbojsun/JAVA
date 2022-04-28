package week9;
//classCasting 개념
//overloading -
//overraiding - 상속받은것을 재정의하는것
public class CastTest {
    public static void main(String[] args) {
        byte b =1 ; int i = 6;
        i = b; //왼쪽 큰것 오른쪽 작은것
//        b = i; 오른쪽 작은것, 왼쪽 큰것 X
        b = (byte) i; //정보손실이 발생하더라도 casting을 하면됨
        SubCls sub = new SubCls(100,88,99);
        SupCls sup = new SupCls();
        SupCls sup1 = new SubCls(); //왼쪽 부모 오른쪽 자식 허용 upcasting
//        SubCls sub1 = new SupCls(); 왼쪽 자식 오른쪽 부모 불가
        Object sup2 = new SubCls();
        SubCls nsub = (SubCls)sup1; //down casting - 반드시 상속관계가 존재해야됨

        System.out.println(sub);
    }
}
