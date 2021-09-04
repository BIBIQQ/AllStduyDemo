package homework;
//对正数的小数进行四舍五入的操作(不考虑负数情况)。
// 四舍五入之后的结果是一个int整数类型并返回
public class DemoMethod05 {
    public static void main(String[] args) {
        double num = 1.49;
        int newnum =(int) getInt(num);

        System.out.println(newnum);
        //排除负数
        if(num < 0){
            System.out.println("数值错误");
        }

    }
    // 四舍五入 （排除负数）
    public static double getInt(double num){
        // 获得十分位
        double numpart = num *10 % 10;
        //四舍五入
        if(numpart < 5){
            int newnum = (int)num;
            return newnum;
        }else{
            int newnum = (int)num+1;
            return newnum;
        }




    }
}
