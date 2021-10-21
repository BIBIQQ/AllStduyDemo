package Day08;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:11:48
 */
public class DemoString02 {
    public static void main(String[] args) {
        // 输入已知的密码
        String username = "admin";
        String passwaord = "123123";
        //三次机会
        for(int i =0 ;i<=3;i++){
            // 输入需要登录的
            Scanner sc = new Scanner(System.in);
            System.out.println("输入用户名");
            String scUser = sc.nextLine();
            System.out.println("输入密码");
            String scPssword = sc.nextLine();
            // 比较
            if(username.equals(scUser)&& passwaord.equals(scPssword)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败");
            }
        }


    }
}
