package Day22.Damo.Demo17;

import java.util.concurrent.CountDownLatch;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:11:52
 */
public class CDLThread  extends Thread{
    private CountDownLatch countDownLatch;
    public CDLThread(CountDownLatch cd) {
        this.countDownLatch = cd;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("好大儿");

    }
}
