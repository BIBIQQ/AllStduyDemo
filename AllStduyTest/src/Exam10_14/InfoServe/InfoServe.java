package Exam10_14.InfoServe;

import Exam10_14.InfoDao.InfoDao;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:18:56
 */
public class InfoServe {
    InfoDao infoDao = new InfoDao();
    Scanner sc = new Scanner(System.in);

    //注册
    @Test
    public void Sign() throws IOException {
        String username = null;
        String password = null;
        while (true) {
            System.out.println("*****************注册用户*****************");
            System.out.println("注册的用户名");
            username = sc.next();
            System.out.println("注册用户密码");
            password = sc.next();
            System.out.println("确认用户密码");
            String ditto = sc.next();
            //判断两次密码输入是否正确
            if (!password.equals(ditto)) {
                System.out.println("两次密码输入不一致，请重新输入");
            } else {
                break;
            }
        }

        boolean falg = infoDao.SignIn(username, password);
        if (falg) {
            String result = "注册";
            EndInterface(result);
        } else {
            System.out.println("注册失败，用户名已经存在");
        }
    }

    //登陆
    public void Login() throws IOException {
        String username = null;
        String password = null;
        while (true) {
            System.out.println("*****************登录用户*****************");
            System.out.println("请输入用户名");
            username = sc.next();
            System.out.println("请输入用户密码");
            password = sc.next();
            HashMap<String, String> alluser = infoDao.AllUser();
            if (alluser.containsKey(username) && password.equals(alluser.get(username))) {
                String result = "登录";
                EndInterface(result);
                break;
            }
            System.out.println("输入的用户名或者密码错误，请重新输入！");
        }
    }

    //登录后结束界面
    public void EndInterface(String result) {
        System.out.println("*****************正在" + result + "*****************");
        lo:
        while (true) {
            System.out.println(result + "成功.退出系统Y/N");
            String choce = sc.next();
            switch (choce) {
                case "Y":
                    System.exit(0);
                case "N":
                    break lo;
                default:
                    System.out.println("请重新输入选项");
                    break;
            }
        }
    }

    //所有用户
    public void allUser() throws IOException {
        HashMap<String, String> hashMap = infoDao.AllUser();
        Set<String> keySet = hashMap.keySet();
        System.out.println("用户名\t\t\t密码");
        for (String user : keySet) {
            System.out.println(user + "\t\t\t" + hashMap.get(user));
        }
    }

    //修改密码
    public void SetPassword() throws IOException {
        String username = null;
        String password = null;
        String newpassword = null;
        while (true) {
            System.out.println("*****************修改用户密码*****************");
            System.out.println("请输入用户名");
            username = sc.next();
            System.out.println("请输入用户旧密码");
            password = sc.next();
            System.out.println("请输入用户新密码");
            newpassword = sc.next();
            HashMap<String, String> alluser = infoDao.AllUser();
            if (alluser.containsKey(username) && password.equals(alluser.get(username))) {
                infoDao.SetPassword(username,newpassword);

                String result = "修改";
                EndInterface(result);
                break;
            }
        }
    }
}
