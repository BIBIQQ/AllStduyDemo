package Day18.Demo.DemoHashSet;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:11:26
 */
public class Demo02 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();

        String d = new String("ccc");

        hs.add(d);
        hs.add(d);

       /* hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("bdd");
        hs.add(new String("ooo"));
        hs.add(new String("qqq"));
        hs2.add("aaa");
        hs2.add("bbb");
        hs2.add("ccc");
        hs2.add("bdd");
        hs2.add(new String("ooo"));
        hs2.add(new String("qqq"));
*/
        hs.forEach(c -> System.out.println(c));

        System.out.println("++++++++++++++++++++");

        boolean a = hs.remove("aaa");
        boolean b = hs.remove(new String("bbb"));
        System.out.println(b);
        System.out.println(a);
        hs.forEach(c -> System.out.println(c));

        System.out.println("============");

        System.out.println(Objects.hashCode(hs));
        System.out.println(hs.hashCode());
        System.out.println(hs2.hashCode());
    }
    /*public int hashCode() {

        return 0;
    }*/
}
