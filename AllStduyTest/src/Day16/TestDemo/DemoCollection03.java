package Day16.TestDemo;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:10:19
 */
public class DemoCollection03 {
    public static void main(String[] args) {
        /*Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("eeeee");*/

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("e");
        //数组for循环遍历删除
       /* for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if("a".equals(s)){
                list.remove(s);
                i--;
            }
        }*/

        // 集合迭代器遍历，删除相同元素
       /* Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if ("a".equals(s)) {
                it.remove();
            }

        }*/

       for(String s : list){
           System.out.println(s);
       }
       // 遍历方式Lambda表达式的
        list.forEach(c -> System.out.println(c));
//        System.out.println(list);
    }
}
