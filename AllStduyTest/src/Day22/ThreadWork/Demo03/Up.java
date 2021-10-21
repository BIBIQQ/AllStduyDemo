package Day22.ThreadWork.Demo03;

import java.nio.BufferUnderflowException;
import java.util.Random;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:20:08
 */
public class Up extends Thread {
    @Override
    public void run() {
        Random r = new Random();

        while (true) {
            synchronized (Car.lock) {
                //车辆有座位的时候
                if (Car.overNum == 30) {
                    //车上没有座位的时候，等待
                    try {
                        Car.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int num = r.nextInt((Car.num - Car.overNum)) + 1;

                    Car.overNum += num;
                    System.out.println("上去了" + num + "个人，现在车上有" + Car.overNum);

                    Car.lock.notifyAll();
                }
            }
        }

    }
}
