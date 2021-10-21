package Day17.Demo.Demo06_TreeSe;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:16:00
 */
public class Demo06_sort {
    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });

        String s1 = "abc";
        String s2 = "d";
        String s3 = "ef";
        String s4 = "ghik";
        String s5 = "lmn";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);
    }
}
