package DAY23.Demo.Demo09;

import java.io.*;
import java.net.Socket;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:15:59
 */
//接受本地文件，创建反馈结果
public class TcpSend {
    public static void main(String[] args) throws IOException {
        //创建本地文件
        FileInputStream fis = new FileInputStream("src\\微信图片.jpg");
        //确认端口
        Socket send = new Socket("127.0.0.1",10010);
        OutputStream os = send.getOutputStream();
        //遍历本地，网络流
        int len;
        while ((len = fis.read()) != -1) {
            os.write(len);
        }


       //结束标记
        send.shutdownOutput();
        //创建反馈结果
        InputStream is = send.getInputStream();
        byte[] bytes = new byte[1024];
        int lin;
        while ((lin = is.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,bytes.length));
        }

        is.close();
        os.close();
        send.close();
        fis.close();
    }
}
