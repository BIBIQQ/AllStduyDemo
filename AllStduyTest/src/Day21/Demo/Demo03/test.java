package Day21.Demo.Demo03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:32
 */

/*
* 键盘录入用户名和密码，保存在本地实现存储
* 要求：用户名和密码独占一行
* */
public class test {
    public static void main(String[] args) throws IOException {
       //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = sc.next();
        System.out.println("输入密码");
        String password = sc.next();

        //存入本地文件
        FileWriter fileWriter = new FileWriter("src\\Day21\\TcpSend.txt");
        fileWriter.write(name);
        fileWriter.write("\r\n");
        fileWriter.write(password);
        //关闭流
        fileWriter.close();
    }
}
