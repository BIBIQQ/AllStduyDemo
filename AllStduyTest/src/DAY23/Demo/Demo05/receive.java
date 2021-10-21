package DAY23.Demo.Demo05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:9:10
 */
public class receive {
    public static void main(String[] args) throws IOException {
        //接收
        ServerSocket accept = new ServerSocket(10000);
        //调用等待
        Socket ss =accept.accept();
        //获取输入流
        InputStream is = ss.getInputStream();
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char)b);
        }
        ss.shutdownInput();
        OutputStream os = ss.getOutputStream();
        os.write("你谁呀".getBytes());
        os.flush();


        //关闭  先开后关原则
        os.close();
        is.close();
        accept.close();
    }
}
