package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:20:07
 */
public class DemoCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tel = sc.nextLine();
        String telStart = tel.substring(0,3);
        String telEnd = tel.substring(7);
        System.out.println(telStart+"****"+telEnd);
    }
}
