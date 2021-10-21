package DAY23.Demo.Demo03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:17:02
 */
//组播接收端
public class Zuaccept {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);
        ms.joinGroup(InetAddress.getByName("224.0.1.0"));

        while (true) {
            DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

            ms.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();

            System.out.println(dp.getAddress());
            System.out.println(new String(data,0,length));
        }
//        ms.close();
    }
}
