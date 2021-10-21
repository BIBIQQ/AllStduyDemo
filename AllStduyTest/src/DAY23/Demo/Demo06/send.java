package DAY23.Demo.Demo06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:11:11
 */
public class send {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要传输的文件名");
//        String next = sc.next();

//        1.读取本地文件
        FileInputStream fis = new FileInputStream("file.txt");
//        2. 通过网络流，发送给服务器
        Socket socket = new Socket("192.168.31.91", 10010);
        OutputStream os = socket.getOutputStream();
        //循环读取和写入
        int line;
        while ((line  = fis.read()) != -1) {
            os.write(line);
        }
//        结束标记
        socket.shutdownOutput();
//        得到返回信息
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int re;
        while ((re = is.read(bytes)) != -1){
            System.out.print(new String(bytes,0,bytes.length));
        }

//        关流
        is.close();
        os.close();
        socket.close();
        fis.close();
    }
}
