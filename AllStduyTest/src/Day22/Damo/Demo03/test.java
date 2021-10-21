package Day22.Damo.Demo03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的Call方法
        MyCallable mc = new MyCallable();
        //可以获取现场执行完毕之后的结果，也可以作为参数传递给Thread对象
        FutureTask<String> sf = new FutureTask<>(mc);
        FutureTask<String> sf1 = new FutureTask<>(mc);
        //创建线程对象
        Thread t1 = new Thread(sf);
        Thread t2 = new Thread(sf1);
        //开启线程
        t1.start();
        t2.start();
        //获取返回值
        String s = sf.get();
        System.out.println(s);

    }
}

//泛型表示返回值的数据类型
class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        //返回值表示线程运行完毕之后的结果
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"和女孩表白" + i);
        }
// 返回值  执行之后的结果
        return "你是个好人";
    }
}