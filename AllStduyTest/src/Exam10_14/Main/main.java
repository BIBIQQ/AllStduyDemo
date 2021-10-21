package Exam10_14.Main;

import Exam10_14.InfoServe.InfoServe;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:18:55
 */
public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InfoServe infoServe = new InfoServe();
        while (true) {
            //登录界面
            System.out.println("*****************欢迎访问百度*****************");
            System.out.println("***************请选择需要的操作****************");
            System.out.println("1.登录；2.注册；3.修改密码；4.删除用户；5.查看所有用户；6.退出系统");
            String choce = sc.next();
            switch (choce) {
                case "1":
                    infoServe.Login();
//                    System.out.println("登录");
                    break;
                case "2":
                    infoServe.Sign();
//                    System.out.println("注册");
                    break;
                case "3":
                    infoServe.SetPassword();
                    System.out.println("修改密码");
                    break;
                case "4":
                    System.out.println("删除用户");
                    break;
                case "5":
                    infoServe.allUser();
//                    System.out.println("查看所有用户");
                    break;
                case "6":
                    System.out.println("退出");
                    System.exit(0);
            }
        }
    }
}
