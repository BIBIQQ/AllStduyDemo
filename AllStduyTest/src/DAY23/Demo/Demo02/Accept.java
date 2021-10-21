package DAY23.Demo.Demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:15:56
 */

//DUP接收
public class Accept {
        //注意点
    //1.需要先运行发送端再运行发送端
    //2.如果接收端启动之后，没有收到信息，就会死等(阻塞)
    //3.接收的时候需要调用getLength
    public static void main(String[] args) throws IOException {
        //确认发送端口
        DatagramSocket ds = new DatagramSocket(10000);

        while (true){
            //构建数据包，接收数据
            byte[] bytes = new byte[8042];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            //接收信息
            ds.receive(dp);
            //解析数据包
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            System.out.println("用户名："+address.getHostName());
            System.out.println(new String(data,0,length));
//            System.out.println(address.getHostAddress() );
        }

        //关闭
//        ds.close();

    }
}
