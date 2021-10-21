package Day22.Damo.Demo10;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:16:39
 */
public class test {
    public static void main(String[] args) {
        new Thread(new Cooker()).start();
        new Thread(new Foodie()).start();
    }
}
