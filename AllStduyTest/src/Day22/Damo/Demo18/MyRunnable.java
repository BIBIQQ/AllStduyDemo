package Day22.Damo.Demo18;

import java.util.concurrent.Semaphore;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:14:35
 */
public class MyRunnable implements Runnable{
    private Semaphore semaphore = new Semaphore(2);
    @Override
    public void run() {
        //获得通行证
        try {
            semaphore.acquire();
            //开始行驶
            System.out.println("获得");
            Thread.sleep(2000);
            System.out.println("归还");
            //归还
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
