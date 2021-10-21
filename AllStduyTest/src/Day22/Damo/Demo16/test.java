package Day22.Damo.Demo16;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:10:42
 */
public class test {
    public static void main(String[] args) throws InterruptedException {

//        HashMap<String, String> hm = new HashMap<>();

//        Hashtable<String, String> hm = new Hashtable<>();

        ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 250; i++) {
                hm.put(i + " ", i + "");
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            for (int i = 250; i < 501; i++) {
                hm.put(i + " ", i + "");
            }
        });

        t2.start();

        Thread.sleep(1000);

        for (int i = 1; i < 501; i++) {
            System.out.println(hm.get(i + " "));

        }
    }
}
