package Day17.Demo.Demo03;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:10:35
 */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 d3 = new Demo03();
        //字符串
        ArrayList<String> list1 = d3.addElement(new ArrayList<>(), "a", "b", "v", "d");
        System.out.println(list1);
        //整数
        ArrayList<Integer> list2 = d3.addElement(new ArrayList<>(), 1, 2, 3, 4, 3, 4, 5, 6, 7, 1, 23, 1);
        System.out.println(list2);
    }

    // 集合批量添加的功能
    //让类，方法，接口更加通用
    public <T> ArrayList<T> addElement(ArrayList<T> list, T ti1, T ti2, T ti3, T ti4) {
        list.add(ti1);
        list.add(ti2);
        list.add(ti3);
        list.add(ti4);
        return list;
    }

    // 可变参数
    public <T> ArrayList<T> addElement(ArrayList<T> list, T... ti1) {
        for (T t : ti1) {
            list.add(t);
        }
        return list;
    }
}
