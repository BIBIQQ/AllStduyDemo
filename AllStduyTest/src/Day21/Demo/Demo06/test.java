package Day21.Demo.Demo06;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\Day21\\TcpSend.txt"),"GBK");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }
        isr.close();

        FileReader fileReader = new FileReader("src\\Day21\\TcpSend.txt", Charset.forName("gbk"));
    }
}
