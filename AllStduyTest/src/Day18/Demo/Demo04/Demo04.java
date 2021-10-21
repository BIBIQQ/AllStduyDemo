package Day18.Demo.Demo04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:16:07
 */
public class Demo04 {
    public static void main(String[] args) {
//        创建对象
        Map<String, String> map = new HashMap<>();
//        添加元素
        map.put("001", "小黑");
        map.put("002", "小红");
        map.put("003", "小白");
        map.put("004", "小六");
        map.put("005", "小明");
        map.put("006", "小黄");
        Once(map);
        System.out.println("=============");
        twice(map);

    }

    public static void twice(Map<String, String> map) {
        // 把双列转换成单列； 双列里的两个对象看做一个对象
        // 先获取每个键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String i = entry.getKey();
            String value = entry.getValue();
            System.out.println(i + "===" + value);
        }
    }

    public static void Once(Map<String, String> map) {
        //获取每一个键
        Set<String> key = map.keySet();
        //遍历Set集合
        for (String s : key) {
            //通过每一个键获取每一个值
            String name = map.get(s);
            System.out.println(s + "==" + name);
        }
    }
}
