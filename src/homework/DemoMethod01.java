package homework;

public class DemoMethod01 {
    public static void main(String[] args) {
    double a = 1.1;
    double b = 2.1;
    double min = getMin(a,b);
        System.out.println(min);
    }
    // 找出较小的值
    public  static double getMin(double a,double b){
        if (a < b){
            return a;
        } else{
            return b;
        }
    }
}
