package DAY23.Demo.Demo05;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:9:10
 */
public class send {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //创建一个Socket对象
        Socket socket = new Socket("127.0.0.1", 10000);

        //获取IO流
        OutputStream os = socket.getOutputStream(); //网络流
        BufferedReader br = null;
        while (true) {
            String next = sc.next();
            os.write(next.getBytes());
            System.err.println("已发送");
            socket.shutdownOutput();// 关闭输出流，写结束标记
//        //获取输入流
//        InputStream is = socket.getInputStream();
//        int b;
//        while ((b = is.read()) != -1) {
//            System.out.print((char)b);
//        }
            //字符流   转中文
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("已接收："+line);
            }
        }

//        //关闭流
//        br.close();
//        os.close();
//        socket.close();
    }
}
