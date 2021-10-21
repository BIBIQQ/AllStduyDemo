package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:19:34
 */
// 字符串  大写前面 数字中间  小写最后    SB拼接
public class DemoBSNSort {
    public static void main(String[] args) {
        System.out.println("输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1 ="";
        String s2 ="";
        String s3 ="";
        for (int i =0;i<str.length();i++){
            char a = str.charAt(i);
            if(a >= 'A'&& a<= 'Z'){
                s1  +=a;
            }else if(a >= 'a' && a <= 'z'){
                s2+=a;
            }else{
                s3+=a;
            }
        }
        System.out.println(s1+s3+s2);

    }
}
