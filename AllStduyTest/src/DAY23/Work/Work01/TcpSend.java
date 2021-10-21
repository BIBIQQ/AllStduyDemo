package DAY23.Work.Work01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:20:08
 */
public class TcpSend {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 确认ip
        Socket socket = new Socket("127.0.0.1",10000);
        //网络流输入
        OutputStream os = socket.getOutputStream();
        System.out.println("请输入一句话");
        String str = sc.next();
        os.write(str.getBytes());
        //结束标记
        socket.shutdownOutput();
        //接受反馈信息
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int line;
        while ((line = is.read(bytes)) != -1){
            System.out.println("我是客户端，我收到的服务器响应是："+new String(bytes,0,line));
        }

        //关流
        is.close();
        os.close();
        socket.close();

    }
}
