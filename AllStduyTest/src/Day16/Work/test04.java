package Day16.Work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:19:33
 */
public class test04 {

    public static void main(String[] args) {
        test04_Servise servise = new test04_Servise();
        //提示用户是否进行随机点名
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("是否进行随机点名");
            String chooce = sc.next();
            switch (chooce) {
                case "yes":
//                    System.out.println("是的");
                    servise.RandomStudent();
                    break;
                case "no":
//                    System.out.println("不是");

                    break lo;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }


}
