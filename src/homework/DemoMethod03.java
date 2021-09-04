package homework;

import java.util.Scanner;

//    在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量
public class DemoMethod03 {
    public static void main(String[] args) {
        // 键盘输入
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int[] brr = getArrMax(num1,num2,num3);
        //遍历输出
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
    // 接收数值，从大到小排列
    public static int[] getArrMax(int num1, int num2, int num3){
        // 只能输出单个，数组形式输出
        // 定义一个初始数组
        int[] arr = {num1,num2,num3};
        int[] brr = new int[3];
        // 获取最大值和最小值
            arr[0] = num1 > num2 ? num1 : num2;
            arr[0] = arr[0] > num3? arr[0] : num3;
            arr[2] = num1 < num2 ? num1 : num2;
            arr[2] = arr[2] < num3? arr[2] : num3;
            // 三个数和减去最大值和最小值
            arr[1] = (num1+num2+num3)-(arr[0]+arr[2]);
        return arr;

    }
}
