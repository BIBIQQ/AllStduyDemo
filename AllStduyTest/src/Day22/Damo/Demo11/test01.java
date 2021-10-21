package Day22.Damo.Demo11;

import java.util.concurrent.*;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:15:02
 */
public class test01 {
    public static void main(String[] args) {
        //参数是线程池的最大值
        //默认也是空的
        //固定线程池
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //单列线程池  只有一个线程容量
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        延迟线程池
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        //  执行需求   时间    单位
        executorService.schedule(()-> System.out.println("你好"),3, TimeUnit.SECONDS);

//        获取当前线程池内线程个数
//        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;
//        System.out.println(pool.getPoolSize());

        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));

        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));

        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));

//        System.out.println(pool.getPoolSize());
    }
}
