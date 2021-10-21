package Day16.TestDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:16:52
 */
// 打印LinkedList的集合，存储以下字符串
public class TestLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");


        //遍历集合
        list.forEach(c -> System.out.println(c));

        System.out.println("-------------------------------");

        //找出书名小于10个字符的
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }

        System.out.println("-------------------------------");

        //取出包含Java的
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String next = iterator2.next();
            if (next.contains("Java")) {
                System.out.println(next);
            }
        }

        System.out.println("-------------------------------");

        //去除Oracle的
        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            String next = iterator3.next();
            if(next.contains("Oracle")){
                //删除
               iterator3.remove();
            }
        }
        // 遍历集合
//       list.forEach(c -> System.out.println(c));
        System.out.println(list);
    }



}
