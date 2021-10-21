package Day19.Demo.Demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:11:48
 */
public class test {
    public static void main(String[] args) {
//        单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.stream().forEach(c -> System.out.println(c));
        System.out.println("---------");
//        双列集合
        HashMap<String, String> maps = new HashMap<>();
        maps.put("aaa", "001");
        maps.put("bbb", "002");
        maps.put("ccc", "003");
        //输出键
        maps.keySet().stream().forEach(c -> System.out.println(c));
        //输出键值对
        maps.entrySet().stream().forEach(c -> System.out.println(c));
        System.out.println("---------");
//        数组
        int[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEach(c -> System.out.println(c));
        System.out.println("---------");
    }
}
