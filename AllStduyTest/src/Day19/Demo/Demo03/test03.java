package Day19.Demo.Demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:11:23
 */
// 输出长度为三 ,姓张的
public class test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("刘梅");
        list.add("张梅");
        list.add("李梅");
        list.add("张三梅");
        list.add("吴梅");

        List<String> list2 = new ArrayList<>();
        list2.add("刘梅");
        list2.add("张梅");
        list2.add("李梅");
        list2.add("张三梅");
        list2.add("吴梅");

        //筛选出姓张，并且长度是三个字的
        List<String> newlist = list.stream().
                filter(c -> c.startsWith("张")).
                filter(d -> d.length() == 3).
                collect(Collectors.toList());
        for (String s : newlist) {
            System.out.println(s);
        }

        System.out.println("-------------");

        //截取到前两个
        list.stream().limit(2).forEach(c -> System.out.println(c));

        System.out.println("-------------");

        //跳跃前两个
        list.stream().skip(2).forEach(c -> System.out.println(c));

        System.out.println("-------------");

        //合并两个流
        Set<String> set = Stream.concat(list.stream(), list2.stream()).collect(Collectors.toSet());
        set.forEach(c-> System.out.println(c));
    }
}
