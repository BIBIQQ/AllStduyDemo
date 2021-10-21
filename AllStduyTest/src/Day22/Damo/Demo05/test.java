package Day22.Damo.Demo05;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        //优先级  ：  1 - 10  默认是 5
        //优先级越高，能够抢到CPU的执行越大，并不是优先级高的，会先执行完
        //没有任何方法可以决定线程的执行顺序
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("飞机");
        t1.setPriority(9);
        t1.start();
        t2.setName("坦克");
        t2.setPriority(1);
        t2.start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}