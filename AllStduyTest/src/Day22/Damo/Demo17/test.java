package Day22.Damo.Demo17;

import java.util.concurrent.CountDownLatch;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:10:42
 */
public class test {
    public static void main(String[] args) {
        //创建CountDownLatch对象，传递线程
        CountDownLatch cd = new CountDownLatch(3);

        CDLThread t1 = new CDLThread(cd);
        t1.start();
        Thread01 t2 = new Thread01(cd);
        t2.start();
        Thread02 t3 = new Thread02(cd);
        t3.start();
        Thread03 t4 = new Thread03(cd);
        t4.start();

    }
}
