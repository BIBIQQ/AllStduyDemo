package JAVASEWork.Test03;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:19:43
 */
/*假如config.properties文件上有如下信息.

username=zs

password=123

color=red

请使用键盘录入要登陆的用户名和密码.判断是否正确打印登陆成功和登陆失败.

要求:

如果登陆成功要读取该用户的color属性的值.

使用字符流

如果color=red  以红色字体把用户所有信息打印到控制台.   // System.err.println(prop);

如果color=black 以黑色字体把用户所有信息打印到控制台.   // System.out.println(prop);
*/
public class test {
    public static void main(String[] args) throws IOException {

//        创建字符流
//        FileOutputStream fis = new FileOutputStream("E:\\HEIMA\\HEIMA\\config.properties");
//        File file = new File("E:\\HEIMA\\HEIMA\\config.properties");
        FileReader fr = new FileReader("E:\\HEIMA\\HEIMA\\config.properties");
        Properties pro = new Properties();
        pro.load(fr);
        fr.close();

        while (true) {
            //        登录界面
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String Username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
//获取键值
//        Set<String> str = pro.stringPropertyNames();
            String user = pro.getProperty("username");
            String ps = pro.getProperty("password");
            if (user.equals(Username) && ps.equals(password)) {
                System.err.println("亲爱的" + Username + "，登录成功，您的信息如下：");
                if (pro.getProperty("color").equals("red")) {
                    System.err.println(pro);
                } else if (pro.getProperty("color").equals("black")) {
                    System.out.println(pro);
                }
                break;
            } else {
                System.out.println("登录失败，用户名或密码不对呀！");
            }
        }
    }
}
