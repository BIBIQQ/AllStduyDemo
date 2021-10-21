package Day18.work.Test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:16:07
 */
/*请使用HashMap集合保存街道两旁的店铺名称;使用门牌号作为键,店铺名作为值,然后使用三种方式遍历输出;

信息如下:

101,阿三面馆

102,阿四粥馆

103,阿五米馆

104,阿六快递

要求:

1:键是整数,值是字符串;

2:输出的信息使用"--"链接
*/
public class Demo04 {
    public static void main(String[] args) {
//        门牌号--键  店铺名--值   三种方式
//        创建对象
        Map<String, String> map = new HashMap<>();
//        添加元素
        map.put("101", "阿三面馆");
        map.put("102", "阿四粥管");
        map.put("103", "阿五米管");
        map.put("104", "阿六快递");

        //第一种
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String vaule = map.get(key);
            System.out.println(key+"---"+vaule);
        }
        System.out.println("=============");
        //第二种
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        System.out.println("=============");
        // 第三种
        map.forEach((s, s2) -> System.out.println(s+"---"+s2));
    }

    public static void twice(Map<String, String> map) {
        // 把双列转换成单列； 双列里的两个对象看做一个对象
        // 先获取每个键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String i = entry.getKey();
            String value = entry.getValue();
            System.out.println(i + "---" + value);
        }
    }

    public static void Once(Map<String, String> map) {
        //获取每一个键
        Set<String> key = map.keySet();
        //遍历Set集合
        for (String s : key) {
            //通过每一个键获取每一个值
            String name = map.get(s);
            System.out.println(s + "---" + name);
        }
    }
}
