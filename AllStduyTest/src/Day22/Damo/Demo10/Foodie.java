package Day22.Damo.Demo10;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:11:30
 */
public class Foodie implements Runnable {
    @Override
    public void run() {
        while (true) {
            //上锁，单次只有一个
            synchronized (Desk.lock) {

                if (Desk.count == 0) {
                    break;
                } else {
                    //判断是否有食物 false
                    if (Desk.flag) {
                        //吃食物
                        System.out.println("正在吃");
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    } else {
                        //如果没有食物就等待
                        try {
                            //使用什么对象当锁，就必须使用这个对象调用等待和唤醒的方法
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }
}
