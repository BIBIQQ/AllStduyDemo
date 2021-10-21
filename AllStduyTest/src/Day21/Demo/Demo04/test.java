package Day21.Demo.Demo04;

import java.io.*;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:32
 */

public class test {
    public static void main(String[] args) throws IOException {

        //字符缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Day21\\TcpSend.txt"));

        bw.write(97);
        //跨平台换行
        bw.newLine();
        bw.write("盒马");
        //闭流
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("src\\Day21\\TcpSend.txt"));
        //查看整行
        String len;
        char[] chars = new char[1024];
        while ((len = br.readLine()) != null) {
            System.out.println(len);
        }
        //关流
        br.close();
    }
}
