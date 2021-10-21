package Day22.Damo.Demo13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:39
 */
public class test {
    public static void main(String[] args) {
        /*
         * 核心线程数量
         * 线程最大线程数量
         * 空闲时间
         * 空闲时间单位
         * 阻塞队列
         * 创建线程方式
         * 执行过多任务方案
         * */
        //手动创建线程池
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                2,      // 核心线程数量
                5,  // 线程最大线程数量
                4,  // 空闲时间
                TimeUnit.SECONDS,   // 空闲时间单位
                new ArrayBlockingQueue<>(10),    // 阻塞队列
                Executors.defaultThreadFactory(),   // 创建线程方式
                new ThreadPoolExecutor.AbortPolicy());   // 执行过多任务方案  抛出异常
        //开启线程池
        tpe.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));
        tpe.submit(() -> System.out.println(Thread.currentThread().getName() + "在持续了"));
        //关闭线程池
        tpe.shutdown();


    }
}
