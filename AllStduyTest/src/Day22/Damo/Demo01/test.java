package Day22.Damo.Demo01;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:32
 */
public class test {
    public static void main(String[] args) {
        //创建现场
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThrea t3 = new MyThrea();
        MyThrea t4 = new MyThrea();
        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
//重写run方法
class MyThrea extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + "--" + i);
        }
    }
}