package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:19:58
 */
public class DemoReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        StringBuilder a = new StringBuilder(str);
        StringBuilder b = a.reverse();
        String c = b.toString();
        if(c.equals(str)){
            System.out.println("相同");
        }else{
            System.out.println("不是");
        }
    }
}
