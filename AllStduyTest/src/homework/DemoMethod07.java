package homework;

import java.util.Scanner;

//通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号
public class DemoMethod07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行");
        int n = sc.nextInt();
        System.out.println("输入列");
        int m = sc.nextInt();
        getFor(n,m);
    }
    public static void getFor(int n,int m){
        // 控制行
        for(int j =1 ; j <= m ;j++) {
            // 控制 列
            for (int i = 1; i <= n; i++) {
                System.out.print("@");
            }
            System.out.println();
        }

        }

    }

