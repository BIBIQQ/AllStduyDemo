package Day22.Damo.Demo17;

import java.util.concurrent.CountDownLatch;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:11:50
 */
public class Thread01  extends Thread{
//    重写CountDownLatch参数
    private CountDownLatch countDownLatch;
    public Thread01(CountDownLatch cd) {
        this.countDownLatch = cd;
    }
    @Override
    public void run() {
        //吃饺子
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"吃饺子");
        }
        //执行完结束
        countDownLatch.countDown();
    }
}
