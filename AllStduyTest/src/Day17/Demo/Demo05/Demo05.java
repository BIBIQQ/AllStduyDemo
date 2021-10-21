package Day17.Demo.Demo05;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:11:28
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList();
        // 所有父类
        printList(list1);
        printList(list2);
        printList(list3);
        printList(list4);
        // Number及所有子类
        method01(list1);
//        method01(list2); // 不是Number类型
        method01(list3);
//        method01(list4);  // 超出Number区域
        // Number及所有父类
//        method02(list1);    //不是Number的父类
//        method02(list2);    //不是Number的父类
        method02(list3);
        method02(list4);
    }

    // 设定通配符区域
    private static void printList(ArrayList<?> list) {
    }

    //表示传递进来的集合的类型，可以是Number类型，也可以是Number的所有父类类型
    private static void method02(ArrayList<? super Number> list) {
    }

    //表示传递进来的集合的类型，可以是Number类型，也可以是Number的所有子类类型
    private static void method01(ArrayList<? extends Number> list) {
    }
}
