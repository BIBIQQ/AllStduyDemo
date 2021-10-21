package Day22.Work.Work02;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:19:11
 */
/*请使用继承Thread类的方式定义一个线程类，在run()方法中循环10次，每1秒循环1次，
每次循环按“yyyy-MM-dd HH:mm:ss”的格式打印当前系统时间。
	请定义测试类，并定义main()方法，启动此线程，观察控制台打印*/
public class text {
    public static void main(String[] args) {

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Date a= new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String time = sdf.format(a);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(time);
                }
            }
        });
        t2.start();

        MyThread t1 = new MyThread();
        t1.start();
    }
}
