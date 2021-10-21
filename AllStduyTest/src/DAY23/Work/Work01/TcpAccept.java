package DAY23.Work.Work01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:20:09
 */
public class TcpAccept {
    public static void main(String[] args) throws IOException {
        //确认接收端口
        ServerSocket ss = new ServerSocket(10000);
        //接收
        Socket accept = ss.accept();
        //网络输入
        InputStream is = accept.getInputStream();
        //接受数据
        byte[] bytes = new byte[1024];
        int line;
        String str = "";
        while ((line = is.read(bytes)) != -1) {
            str = new String(bytes, 0, bytes.length);
            System.out.println("我是服务器端，我收到的客户端请求是:" + str);
        }
        //反转
        StringBuffer sf = new StringBuffer(str);
        String StrRevers = sf.reverse().toString();
        //输出反馈信息
        OutputStream os = accept.getOutputStream();
        os.write(StrRevers.getBytes());

        accept.shutdownOutput();

        //关闭
        os.close();
        is.close();
        ss.close();
    }
}
