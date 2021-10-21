package Day21.Work.work04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:18:43
 */
public class test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\HEIMA\\HEIMA\\config.properties");
        BufferedReader bf = new BufferedReader(fr);
        HashMap<String, String> hashMap = new HashMap<>();

        String line;
        while ((line = bf.readLine()) != null) {
            String[] split = line.split("=");
            hashMap.put(split[0], split[1]);
        }

        while (true) {
            //        登录界面
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String Username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //判断输入的密码是否正确
            if (hashMap.get("username").equals(Username) && hashMap.get("password").equals(password)) {
                System.err.println("亲爱的" + Username + "，登录成功，您的信息如下：");
                if (hashMap.get("color").equals("red")) {
                    System.err.println(hashMap);
                } else if (hashMap.get("color").equals("black")) {
                    System.out.println(hashMap);
                }
                break;
            } else {
                System.out.println("登录失败，用户名或密码不对呀！");
            }
        }
        bf.close();
    }
}
