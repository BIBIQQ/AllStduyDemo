package Day22.ThreadWork.Demo02;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:19:36
 */
public class TeachThread extends Thread {
    @Override
    public void run() {

        synchronized (StuThread.lock) {
            System.out.println("已经准备好讲课，正在等待同学们到齐。。");

            if (StuThread.count == 10) {
                System.out.println("张老师开始讲Java课程了。。");
            }

            //等待学生到来
            try {
                StuThread.lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //学生到齐后，讲课

                System.out.println("张老师开始讲Java课程了。。");

        }
    }
}
