package Test;

import java.nio.channels.AsynchronousByteChannel;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:9:37
 */
public class DemoArrList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("ccc");

        list.add(2,"ooo");
//        list.removeAll(Collections.singleton("abc"));
        list.set(1,"niu");

        String s1 =  list.get(1);
        System.out.println(s1);

    int s2 = list.size();
        System.out.println(s2);
        System.out.println(list);
    }
}
