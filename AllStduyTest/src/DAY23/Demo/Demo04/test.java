package DAY23.Demo.Demo04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:15:48
 */
//广播发送端
public class test {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String s = "👌";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName,port);

        ds.send(dp);

        ds.close();
    }
}
