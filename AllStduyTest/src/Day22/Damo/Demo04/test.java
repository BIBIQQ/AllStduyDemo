package Day22.Damo.Demo04;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:32
 */
/*
 * 获取和设置线程的名称
 * */
public class test {
    public static void main(String[] args) {
        //线程有默认名称 --  Thread--编号
        //创建线程
        //实现有参，需要在类中构造有参
        MyThread t1 = new MyThread("小吴");
        MyThread t2 = new MyThread("小王");

        //设置线程名称
        //一般放在开启线程之前
       /* t1.setName("你好");
        t2.setName("我不好");*/

        //开启线程
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    //需要构造无参和有参
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@@" + i);
        }

    }
}