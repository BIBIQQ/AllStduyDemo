package Day22.Damo.Demo18;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:10:42
 */
public class test {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        for (int i = 0; i < 100; i++) {
            new Thread(mr).start();
        }
    }
}
