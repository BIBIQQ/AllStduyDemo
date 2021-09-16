package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:18:48
 */
/*2.完成遍历字符串案例(两种方式)
        键盘录入一个字符串，使用程序实现在控制台遍历该字符串*/
public class DemoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String i = sc.nextLine();
        char[] ione = i.toCharArray();
        System.out.println("展示：");
        for (int i1 = 0; i1 < ione.length; i1++) {
            System.out.print(ione[i1]+" ");
        }
        System.out.println( );
        System.out.println("展示：");
        for (int j =0;j<i.length();j++){
            char a = i.charAt(j);
            System.out.print(a+" ");
        }

    }
}
