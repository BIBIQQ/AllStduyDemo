package Day22.Damo.Demo02;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) {
        //创建了一个参数对象
        MyRunable mr = new MyRunable();
        //创建了一个线程对象，并把参数传递给了这个线程
        //在线程启动之后，执行的就是参数里面的run方法
        Thread t1 = new Thread(mr);
        //开启线程
        t1.start();

        Thread t2 = new Thread(mr);
        t2.start();

    }
}
//创建MyRunable的实现类实现Runable接口
class MyRunable implements Runnable {

    @Override
    public void run() {
        //构建线程实现参数
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "第二种线程实现" + i);
        }
    }
}