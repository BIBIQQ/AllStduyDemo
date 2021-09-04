package Day05;

import java.util.Scanner;

public class DemoMethod01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = method(a,b,c);
        System.out.println(d);

    }

    public static int  method(int num1,int num2,int num3){
            // 两个if
            /*if(num1 < num2){
                if(num2 < num3){
                    System.out.println(num3);
                }else {
                    System.out.println(num2);
                }
            }else{
                if(num1 > num3){
                    System.out.println(num1);
                }else{
                    System.out.println(num3);
                }

            }*/
            // 三元运算符
        int max=num1 > num2? num1:num2;
        max=max > num3? max:num3;
        return max;

    }
}
