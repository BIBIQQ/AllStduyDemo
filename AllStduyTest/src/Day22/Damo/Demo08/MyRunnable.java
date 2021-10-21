package Day22.Damo.Demo08;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:10:46
 */
public class MyRunnable implements Runnable {
    private int a =100;

    @Override
    public void run() {
        while (true){
            if ("窗口一".equals(Thread.currentThread().getName())) {
                //同步方法
                boolean result = synchronizedMthod();
                if(result){
                    break;
                }
            }
            if ("窗口三".equals(Thread.currentThread().getName())) {
                //同步方法
                boolean result = synchronizedMthod();
                if(result){
                    break;
                }
            }
            if("窗口二".equals(Thread.currentThread().getName())){
               //同步代码块
                synchronized (this){
                    if(a == 0){
                        break;
                    }else {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        a--;
                        //时间差
                        System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + a);
                    }
                }
            }
        }
    }

    private synchronized boolean synchronizedMthod() {
        if (a == 0){
            return true;
        }else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a--;
            System.out.println(Thread.currentThread().getName()+"卖票，剩下"+a);
        }
        return false;
    }
}
