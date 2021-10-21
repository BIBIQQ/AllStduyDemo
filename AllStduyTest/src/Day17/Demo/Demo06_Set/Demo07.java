package Day17.Demo.Demo06_Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:11:45
 */
public class Demo07 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        //默认自然顺序 排序
        set.add("ddd");
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("ccc");

        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------");

        //增强for遍历，没有索引，因此无法使用普通for
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------------");
        //foreach的遍历---Lambda
        set.forEach(c -> System.out.println(c));
    }
}
