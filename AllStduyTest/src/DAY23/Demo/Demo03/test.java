package DAY23.Demo.Demo03;

import java.io.IOException;
import java.net.*;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:15:48
 */
//组播发送端
public class test {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String s = "11";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("224.0.255.0");
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName,10100);
        ds.send(dp);
        ds.close();

    }
}
