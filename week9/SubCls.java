package week9;

public class SubCls extends SupCls{
    int sum;
    double avg;
    String addr;
    public SubCls(){
        sum = kor + eng + math;
    }
    public SubCls(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        sum = kor + eng + math;
        avg = sum / 3.0;
    }
    @Override
    public String toString() {
        return "SubCls{" +
                "sum=" + sum +
                ", avg=" + avg +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
        //Override = 상속받는것을 재정의
    }
}
