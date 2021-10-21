package DAY23.Demo.Demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:15:09
 */
public class test {
    public static void main(String[] args) throws UnknownHostException {

        //设置地址
        InetAddress byName = InetAddress.getByName("192.168.31.92");
        //获取地址的名字
        String hostName = byName.getHostName();
        System.out.println(hostName);
        //获得地址的ip地址
        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);


    }
}
