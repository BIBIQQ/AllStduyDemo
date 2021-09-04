package homework;
//该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行
public class DemoMethod02 {
    public static void main(String[] args) {
    int max = getMax(2,10,9);
        System.out.println(max);
    }
    //  找到最大值的
    public static int getMax(int a,int b,int c){
        int max = a > b? a :b ;
        max = max > c? max : c;
        return max;
    }
}
