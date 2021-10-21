package Day16.TestDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:11:33
 */
public class DemoList {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        Listadd(list);   // 增加
//       Listremove(list);  //删除
//        Listset(list);    //修改
//        Listget(list);    //获取
    }

    public static void Listget(List<String> list) {
        // 获取指定位置的元素
        String s = list.get(0);
        System.out.println(s);
    }

    public static void Listset(List<String> list) {
        // 修改指定元素，会返回被修改的元素
        //被替代的元素，在集合中就不存在了
        String  result = list.set(0,"qqq");
        System.out.println(result);
        System.out.println(list);
    }

    private static void Listremove(List<String> list) {
        // 删除指定元素，会返回被删除的元素
        String s = list.remove(0);
        // 删除指定元素，集合中的第一个，返回删除的布尔值
        boolean result = list.remove("aaa");
        System.out.println(result);
    }

    private static void Listadd(List<String> list) {
        // add 在指定位置插入指定元素，原来上的元素往后挪一个索引
        list.add(0,"ddd");
    }
}
