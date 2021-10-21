package Day19.BaiduSignIn;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:21:06
 */
public class main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        while (true) {
            System.out.println("************欢迎访问百度***********");
            System.out.println("************请选择需要的操作***********");
            System.out.println("1.登录；2.注册；3.修改密码；4.删除用户 5.查看所有用户");
            Scanner sc = new Scanner(System.in);
//        输入你的选择
            String choce = sc.next();
            switch (choce) {
                case"1":
//                    System.out.println("登录");
                    userService.SignInto();
                    break;
                case "2":
//                    System.out.println("注册");
                    userService.addUser();
                    break;
                case "3":
//                    System.out.println("修改密码");
                    userService.ChangePW();
                    break;
                case "4":
//                    System.out.println("删除用户");
                    userService.remove();
                    break;
                case "5":
//                    System.out.println("查看所有用户");
                    userService.ToSeeAll();
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        }
    }
}
