package Day22.Work.Work03;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:20:01
 */
public class MyRunnable implements Runnable {
    private static int pepole = 0;
    private  static Object obj = new Object();
    @Override
    public void run() {

            synchronized (obj){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pepole++;
                System.out.println(Thread.currentThread().getName()+"通过山洞，他是第"+pepole+"个");
            }
        }
    }

