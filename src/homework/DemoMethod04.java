package homework;
//数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
// 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。
public class DemoMethod04 {
    public static void main(String[] args) {
        double absolute = Math(-1.1);
        System.out.println(absolute);
    }
    public static double Math(double num){
        if(num >= 0){
            return num;
     }else {
            return -num;
        }
    }
}
