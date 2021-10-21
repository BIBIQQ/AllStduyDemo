package Day21.Demo.Demo02;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src\\Day21\\TcpSend.txt");
        // 单个字符输出
        int chars;
        while ((chars = fileReader.read()) != -1) {
            System.out.print((char) chars);
        }

        //创建数组形式输出
        char[] chs = new char[1024];
        int len;
        // read方法还是读取，但是一次读取多个字符
        //把读到的字符存入到chs数组中
        //返回值;表示本次读到了多少个字符
        while ((len = fileReader.read(chs)) != -1) {
            System.out.print((char) len);
        }

        fileReader.close();
    }
}
