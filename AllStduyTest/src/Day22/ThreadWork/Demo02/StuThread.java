package Day22.ThreadWork.Demo02;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:19:31
 */
public class StuThread extends Thread {
    public static int count = 0;
    public static Object lock = new Object();

    @Override
    public void run() {

        synchronized (lock) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "到了。。。");
            count++;
            if (count == 10) {
                lock.notifyAll();
                return;
            }
        }

    }
}
