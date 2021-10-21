package Day22.Damo.Demo07;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:39
 */
public class test {
    public static void main(String[] args) {
        /*
        * 多线程能提高程序的效率，但是会引发线程安全问题。
        * 需要加锁 - - 降低效率
        * */
        Ticket ticket1 = new Ticket();

        Thread t1 = new Thread(ticket1);
        Thread t2 = new Thread(ticket1);
        Thread t3 = new Thread(ticket1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();

        t2.start();

        t3.start();
    }
}
