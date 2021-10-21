package Day22.Damo.Demo09;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:39
 */
public class test {
    public static void main(String[] args) {
        Object A = new Object();
        Object B = new Object();
        //线程锁嵌套
        new Thread(() ->{
           while (true){
               synchronized (A){
                   synchronized (B){
                       System.out.println("吃");
                   }
               }
           }
        }).start();

        new Thread(() ->{
            while (true){
                synchronized (B){
                    synchronized (A){
                        System.out.println("喝");
                    }
                }
            }
        }).start();
    }
}
