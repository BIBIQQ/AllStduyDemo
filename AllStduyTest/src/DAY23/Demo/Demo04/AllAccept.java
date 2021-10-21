package DAY23.Demo.Demo04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:17:08
 */
//广播接收端
public class AllAccept {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            //构包
            DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
            //接收信息
            ds.receive(dp);
            //解析数据
            byte[] data = dp.getData();
            int length = dp.getLength();
            System.out.println(new String(data,0,length));
        }

//        ds.close();
    }
}
