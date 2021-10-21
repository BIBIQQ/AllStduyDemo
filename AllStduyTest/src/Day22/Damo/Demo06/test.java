package Day22.Damo.Demo06;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("女神");
        t2.setName("备胎");
        //把第二个线程设置成为守护线程
        //普通线程结束后，守护线程就不会执行完毕
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"---"+i);
        }
    }
}