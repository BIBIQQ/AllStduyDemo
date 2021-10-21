package Day22.Damo.Demo14;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:16:56
 */
public class gile extends Thread{
    @Override
    public void run() {
        if(Money.money == 100){
            System.out.println("钱对的");
        }
        System.out.println("钱没了");
    }
}
