package Day11.DemoPack;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:16:06
 */
public abstract class Wirter {
    public void write(){
        System.out.println("这是");
        body();
        System.out.println("结束");
    }

   public abstract void body();
}
