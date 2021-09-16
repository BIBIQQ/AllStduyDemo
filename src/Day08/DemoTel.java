package Day08;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:15:19
 */
public class DemoTel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tel = sc.nextLine();
//        String telStart = tel.substring(0,3);
//        String telEnd = tel.substring(7);
//        System.out.println(telStart+"****"+telEnd);
    String a = tel.replace("TMD","***");
        System.out.println(a);
    }

}
