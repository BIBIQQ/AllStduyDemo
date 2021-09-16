package Day08.work;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:18:39
 */
public class DemoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //已知的账号密码
        String User = "admin";
        String Pass = "123456";
        //可以输入三次账号和密码
        for (int i = 0; i <3 ; i++) {
            int count =0;
            System.out.println("请输入账号名");
            String userName = sc.nextLine();
            System.out.println("请输入密码");
            String passWord = sc.nextLine();
            if(userName.equals(User) && passWord.equals(Pass)){
                System.out.println("登录成功");
                break;
            }else{
                count = 2-i;
                System.out.println("登录失败，你还有"+count+"次机会");
            }



        }

    }
}
