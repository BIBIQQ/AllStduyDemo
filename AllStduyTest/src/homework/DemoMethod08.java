package homework;

import java.util.Scanner;

public class DemoMethod08 {
    public static void main(String[] args) {
        // 键盘输入 所需乘法值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数：");
        int num = sc.nextInt();
        getTable(num);
    }
    public static void getTable(int num){

        // 输出乘法表
        //  控制列
        for(int i =1 ;i <= num ;i ++) {
            for(int j = 1 ; j <=i ;j++) {
                System.out.print(j + "x" + i + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
