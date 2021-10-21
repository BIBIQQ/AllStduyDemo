package DAY23.Demo.Demo06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:11:11
 */
public class recevies {
    public static void main(String[] args) throws IOException {
        //读取客户端数据，写入本地
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            //获取客户端对象
            Socket accept = ss.accept();
            //获取输入流
            InputStream is = accept.getInputStream();
            //修改文件名称，保障全局唯一
            String name = UUID.randomUUID().toString()+".txt";
            FileOutputStream fos = new FileOutputStream("src\\DAY23\\Demo\\Demo06\\"+name);
            //循环读取和写入
            int line;
            while ((line = is.read()) != -1) {
                fos.write(line);
            }
//        返回信息
            OutputStream os = accept.getOutputStream();
            os.write("上传成功".getBytes());
            os.flush();
            accept.shutdownOutput();
//        关流
            os.close();
            fos.close();
            accept.close();
        }
//        ss.close();
    }
}
