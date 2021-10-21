package DAY23.Demo.Demo09;

import java.io.*;
import java.lang.invoke.VarHandle;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:16:13
 */
public class TcpReceive {
    public static void main(String[] args) throws IOException {
        //确认端口
        ServerSocket ss = new ServerSocket(10010);
        //接受信息
        Socket accept = ss.accept();
        //输入
        InputStream is = accept.getInputStream();
        //读取到的写入本地文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\DAY23\\Demo\\Demo09\\1.jpg"));
        //遍历写入
        int len;
        while ((len = is.read()) != -1) {
            bos.write(len);
        }


        OutputStream os = accept.getOutputStream();
        os.write("我可真是大聪明".getBytes());
         os.flush();
        accept.shutdownOutput();

        os.close();
        bos.close();
        is.close();
        ss.close();
    }
}
