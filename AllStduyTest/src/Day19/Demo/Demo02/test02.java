package Day19.Demo.Demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:10:49
 */
public class test02 {
    public static void main(String[] args) {
        List<String> a = List.of("a", "b", "c");
        List<String> b = new ArrayList<>(a);
        System.out.println(b);
        b.add("c");
        b.add("d");
        b.add("f");

        Set<String> a1 = Set.of("a", "b", "c");
        Map<String, String> maps = Map.of("001", "a", "002", "b");
        Map<String, String> maps02 = Map.ofEntries(Map.entry("002", "c"), Map.entry("003", "d"));
        System.out.println(a1);
        System.out.println(maps);
        System.out.println(maps02);
    }
}
