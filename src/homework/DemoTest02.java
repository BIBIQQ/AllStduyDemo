package homework;

import java.awt.*;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:19:01
 */
public class DemoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int temp = i;
        i = j;
        j = temp;
        System.out.println("进行转换");
        System.out.println(i);
        System.out.println(j);
    }
}
