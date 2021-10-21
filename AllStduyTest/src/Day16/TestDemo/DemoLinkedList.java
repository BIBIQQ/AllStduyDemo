package Day16.TestDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:16:04
 */
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
       //添加到最后一位
        list.addLast("eee");

        //添加到开头
        list.addFirst("000");

        // 返回列表中第一个元素
        String a =list.getFirst();
        System.out.println(a);
        System.out.println("----------------");

        // 返回列表中最后一个元素
        String b =list.getLast();
        System.out.println(b);
        System.out.println("----------------");

        // 删除第一个元素
        list.removeFirst();

        //删除最后一位
        list.removeLast();

        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------");
        // 迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------");
        // 增强
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------");
        //lambda
        list.forEach(c -> System.out.println(c));
    }
}
