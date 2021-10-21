package DAY23.Demo.Demo02;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:15:48
 */
//DUP发送
public class test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //确认发送端口
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            //打包礼物
            String s = "🤘🎈";
            String num = sc.next();

            byte[] bytes = num.getBytes();
            //确认发送ip
            InetAddress address = InetAddress.getByName("192.168.31.58");
            int port = 10000;
            //封装成数据包
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
            //发送信息
            ds.send(dp);
            System.err.println("已发送");
            if(num.equals("886")){
                break;
            }

        }
        System.out.println("结束聊天");
        //释放资源
//        ds.close();

    }
}
