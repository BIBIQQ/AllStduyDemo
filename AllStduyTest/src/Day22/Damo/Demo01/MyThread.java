package Day22.Damo.Demo01;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:11:34
 */
public class MyThread  extends Thread{
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"--"+i);

        }
    }
}
