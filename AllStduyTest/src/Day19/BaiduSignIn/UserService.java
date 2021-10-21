package Day19.BaiduSignIn;

import java.util.Map;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/28
 * @TIME:12:25
 */
public class UserService {
    Scanner sc = new Scanner(System.in);
    UserDao userDao = new UserDao();

    //添加用户信息
    public void addUser() {
        Loop:
        while (true) {
            System.out.println("************注册用户***********");
            System.out.println("注册的用户名");
            String name = sc.next();
            System.out.println("注册用户密码");
            String password = sc.next();
            //确认二次输入的密码是否一致，不一致不进行后续
            while (true) {
                System.out.println("确认用户密码");
                String Agpassword = sc.next();
                boolean result = password.equals(Agpassword);

                if (result) {

                    //判断是否存在
                    boolean whether = userDao.addUser(name, password);
                    if (whether) {
                        System.out.println("输入的用户信息已经存在，请重新进行用户信息录入");
                        break;
                    }
                    break Loop;
                } else {
                    System.out.println("输入错误请重新输入");
                }
            }
        }
        System.out.println("************正在修改***********");
        System.out.println("注册成功，退出系统Y/N");
        //结束后，是否要继续
        Select();
    }

    //    查看所有用户信息
    public void ToSeeAll() {
        System.out.println("请先登陆，不然不给看");
        //        输入用户登录信息
        System.out.println("用户名：");
        String name = sc.next();
        System.out.println("登录密码：");
        String password = sc.next();
//        判断输入的用户名是否存在和登录密码是否正确
        boolean result = userDao.exist(name, password);
        if (result) {
            Map<String, String> userinfo = userDao.ToSeeAll();
            System.out.println("用户名" + " \t\t\t\t\t" + "密码");
            userinfo.forEach((K, V) -> {
                System.out.print(K + "\t\t\t\t\t" + V);
                System.out.println();
            });
        } else {
            System.out.println("未登陆");
        }
    }

    //    登录
    public void SignInto() {
//        输入用户登录信息
        System.out.println("用户名：");
        String name = sc.next();
        System.out.println("登录密码：");
        String password = sc.next();
//        判断输入的用户名是否存在和登录密码是否正确
        boolean result = userDao.exist(name, password);
        if (result) {
            System.out.println("************正在登录***********");
            System.out.println("登录成功，退出系统Y/N");
            Select();
        } else {
            System.out.println("输入的用户名和密码错误请重新输入");
        }
    }

    //    判断是否要继续执行
    public void Select() {
        lo:
        while (true) {
            String choce = sc.next();
            switch (choce) {
                case "Y":
                    System.out.println("结束");
                    System.exit(0);
                case "N":
//                    System.out.println("继续");
                    break lo;
                default:
                    System.out.println("输入错误请重新输入");
                    continue;
            }
        }
    }

    //修改密码
    public void ChangePW() {
        System.out.println("输入修改密码的用户名");
        String name = sc.next();
        System.out.println("输入修改用户名的密码");
        String password = sc.next();
        System.out.println("输入修改的密码");
        String newpassword = sc.next();
        //判断输入的修改的账号密码是否正确
        boolean result = userDao.exist(name, password);
        if (result) {
//            修改密码
            userDao.ChangePW(name, newpassword);
        } else {
            System.out.println("输入的账号密码错误");
        }
    }

    //删除用户信息
    public void remove() {
//        输入用户删除信息
        System.out.println("请输入需要删除的用户名：");
        String name = sc.next();
        System.out.println("请输入删除用户的登录密码：");
        String password = sc.next();
        boolean result = userDao.exist(name, password);
        if (result) {
            userDao.remove(name);
            System.out.println("************正在删除***********");
            System.out.println("删除成功，退出系统Y/N");
            Select();
        } else {
            System.out.println("输入的用户名或用户信息错误");
        }
    }
}

