package Day22.ThreadWork.Demo01;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:18:38
 */
/*
* 请利用线程间通信, 完成连续打印1-100的数字, 要求一条线程专门打印奇数,另外一条专门用来打印偶数
* */
public class test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Even());
        t1.setName("线程一");
        Thread t2 = new Thread(new Odd());
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
