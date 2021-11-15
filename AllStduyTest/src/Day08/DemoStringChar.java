package Day08;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:14:41
 */
public class DemoStringChar {
    public static void main(String[] args) {
        System.out.println("输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        char[] array = a.toCharArray();
        int BigCount = 0;
        int SmallCount = 0;
        int NumCount = 0;
        int ElseCount =0;

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if(c>= '0' && c<= '9'){
                NumCount++;
            }else if(c>= 'a' && c<= 'z'){
                SmallCount++;
            }else if(c>= 'A' && c<= 'Z'){
                BigCount++;
            }else{
                ElseCount++;
            }
        }

        System.out.println("大写字母有："+BigCount+"个");
        System.out.println("小写字母有："+SmallCount+"个");
        System.out.println("数字字母有："+NumCount+"个");
        System.out.println("其他字符有："+ElseCount+"个");

    }
}
