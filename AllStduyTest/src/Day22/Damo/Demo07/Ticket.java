package Day22.Damo.Demo07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:45
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    private static Object a = new Object();

    @Override
    public void run() {
        ReentrantLock a = new ReentrantLock();
        while (true) {
            //需要一个任意对象
//            synchronized (a) {
            a.lock();
            if (ticket <= 0) {
                break;
            } else {

                try {
                    Thread.sleep(50);
                    ticket--;
                    //时间差
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + ticket);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    a.unlock();
                }
            }
//            }
        }
    }
}
