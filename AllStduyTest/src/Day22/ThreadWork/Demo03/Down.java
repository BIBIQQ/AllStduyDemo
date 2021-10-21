package Day22.ThreadWork.Demo03;

import java.util.Random;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:20:08
 */
public class Down extends Thread{

    @Override
    public void run() {
        Random r = new Random();

        while (true) {
            synchronized (Car.lock) {
                //座位有人的时候
                if(Car.overNum == 0){
                    //车上的剩余座位都没有人了
                    try {
                        Car.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{

                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int num = r.nextInt(Car.overNum)+1;

                    Car.overNum -= num;
                    System.out.println("下去了"+num+"个人，现在车上有"+Car.overNum);
                    Car.lock.notifyAll();
                }
            }
        }
    }
}
