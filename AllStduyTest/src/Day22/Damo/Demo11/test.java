package Day22.Damo.Demo11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:39
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        //创建线程池对象，默认是空的
        //  内置线程池   newCachedThreadPool   缓存线程池（无界线程池）  Integer.max()  21亿
        ExecutorService executorService = Executors.newCachedThreadPool();
        //  Executors--创建对象
        //  ExecutorService -- 控制线程池
        //开启线程池
        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));

        Thread.sleep(200);

        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));
        // 关闭线程池
        executorService.shutdown();
    }
}
