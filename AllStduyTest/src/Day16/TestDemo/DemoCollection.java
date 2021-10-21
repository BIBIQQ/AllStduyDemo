package Day16.TestDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:9:32
 */
public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("eeeee");

        // 判断是否存在某元素
        boolean result = collection.contains("aaa");
        System.out.println(result);
        // 删除符合条件的元素
        collection.removeIf(s -> s.length() == 3);
        System.out.println(collection);
        //集合是否为空
        boolean result1 = collection.isEmpty();
        System.out.println(result1);
        //清空集合
        collection.clear();
        System.out.println(collection);
        //获取集合的长度
        int size = collection.size();
        System.out.println(size);
        // removerIf的拓展
        collection.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length() == 4){
                    return  true;
                }else{
                    return false;
                }
            }
        });
        System.out.println(collection);
    }
}
