package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:20:16
 */
public class DemoReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String newnum = num.replace("TMD","***");
        System.out.println(newnum);
    }
}
