package Demo.Main;

import Demo.ManagerServce.StaffSever;
import Demo.ManagerServce.SubwayServer;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:14:44
 */


//
//2.3. 给出提示,获取管理人员输入的工号和姓名
//
//2.4. 判断管理人员信息集合中是否包含管理人员输入的工号和姓名,给出对应的登录结果
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StaffSever staffSever = new StaffSever();


        while (true) {
            //登录界面
            System.out.println("------------------龙港地铁管理人员登录界面------------------");
            //员工登录
            System.out.println("请输入你的工号和姓名(输入“退出”退出登录界面)");
            String id = sc.next();
            if (id.equals("退出")) {
                break;
            }
            System.out.println("请输入姓名");
            String name = sc.next();
            //判断员工登录信息是否存在
            boolean falg = staffSever.StaffExist(id, name);
            if (!falg) {
                System.out.println("输入的工号和名字错误");
            } else {
                System.out.println("登录成功，欢迎您的使用！！");
                SubwayShow();
            }
        }

    }

    private static void SubwayShow() throws IOException {
        SubwayServer subwayServer = new SubwayServer();
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            //登录界面
            System.out.println("------------------龙港地铁地铁管理系统------------------");
            //登录成功后才可以使用
            System.out.println("1.查看所有地铁信息；2.添加新地铁信息；(输入“退出”退出管理系统)");
            //输入选择
            String choce = sc.next();
            switch (choce) {
                case "1":
                    subwayServer.AllSubway();
                    //  System.out.println("查看所有地铁信息");
                    break;
                case "2":
                    subwayServer.addSubway();
//                    System.out.println("添加新地铁信息");
                    break;
                case "退出":
                    System.out.println("感谢您的使用");
                    break lo;
            }
        }
    }
}
