package Day19.Demo.Demo05;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:16:42
 */
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,21");
        list.add("zhangsan,26");
        list.add("zhangsan,20");

        Map<String, String> collect = list.stream().filter(c -> {
            String[] split = c.split(",");
            int i = Integer.parseInt(split[1]);
            return i >= 23;
        }).collect(Collectors.toMap(s -> s.split(",")[0], v -> v.split(",")[1]));
        System.out.println(collect);
    }
}
