package Day18.Demo.Demo03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:15:45
 */
public class DemoMap {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        //添加
        //如果添加的键不存在，如果键存在，就会覆盖原先的值，并将原先的值作为返回值返回
        map.put("001", "小黑");
        map.put("002", "小红");
        map.put("003", "小白");
        String s = map.put("001", "大黑");
        System.out.println(s);
        System.out.println(map);
        //删除
        String a = map.remove("001");
        System.out.println(a);
        System.out.println(map);
        //判断是否存在
        boolean result = map.containsKey("001");
        boolean result1 = map.containsValue("小红");
        System.out.println(result);
        System.out.println(result1);
        //清空
        ((HashMap<String, String>) map).clone();
        map.clear();
        System.out.println(map);
        // 检测是否为空
        boolean result02 = map.isEmpty();
        System.out.println(result02);


    }
}
