package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:19:01
 */
public class DemoBSNCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String a = sc.nextLine();
        int BigCount = 0;
        int SmallCount = 0;
        int NumCount = 0;
        for (int i = 0; i < a.length(); i++) {
            char tager = a.charAt(i);
            if (tager >= '0'&& tager <= '9'){
                NumCount++;
            }else if(tager >= 'a' && tager <= 'z'){
                SmallCount++;
            }else {
                BigCount++;
            }
        }
        System.out.println("大写字母"+BigCount);
        System.out.println("小写字母"+SmallCount);
        System.out.println("数字字母"+NumCount);
    }


}

