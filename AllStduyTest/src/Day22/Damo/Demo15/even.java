package Day22.Damo.Demo15;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:10:30
 */
public class even  extends Thread{
    @Override
    public void run() {
        int num = Num.a.incrementAndGet();
        if(num % 2 == 0){
            System.out.println(getName()+num);
        }
    }
}
