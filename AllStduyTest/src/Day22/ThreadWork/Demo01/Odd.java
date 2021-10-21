package Day22.ThreadWork.Demo01;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:18:44
 */
public class Odd implements Runnable {
    @Override
    public void run() {
        //奇数先打印
        while (true){
            synchronized (Num.obj) {
                if(Num.number > 100){
                    break;
                }else {
                    //判断是奇数
                    if(Num.flag){
                        System.out.println(Thread.currentThread().getName()+"打印奇数："+Num.number);
                        Num.number++;
                        Num.flag = false;
                        Num.obj.notifyAll();
                    }else{
                        //如果是偶数就等待
                        try {
                            Num.obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }

        }
    }
}
