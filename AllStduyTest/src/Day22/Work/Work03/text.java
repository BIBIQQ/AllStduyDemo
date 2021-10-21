package Day22.Work.Work03;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:19:11
 */

/*
*请编写多线程应用程序，模拟多个人通过一个山洞：
	(1).这个山洞每次只能通过一个人，每个人通过山洞的时间为1秒；
	(2).创建10个线程，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
* */
public class text {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        for (int i = 1; i < 11; i++) {
            Thread t1 = new Thread(mr);
            t1.setName("线程"+i);
            t1.start();
        }

    }
}
