package Day14.HomWork.String_int_add;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:14:15
 */
/*请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，
程序可以将这个String类型的分数值转换为int值，并将分数 + 5分后打印到控制台。*/
public class text01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc .next();
        // Integer的
        Integer num = Integer.parseInt(string);
        System.out.println(num+5);
    }
}
