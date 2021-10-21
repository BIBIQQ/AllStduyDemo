package Day22.Damo.Demo08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:39
 */
public class test {
    public static void main(String[] args) {
        MyRunnable ticket1 = new MyRunnable();

        Thread t1 = new Thread(ticket1);
        Thread t2 = new Thread(ticket1);
        Thread t3 = new Thread(ticket1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();

        t2.start();

        t3.start();
    }
}
