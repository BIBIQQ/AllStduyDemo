package DAY24.Demo.Demo02;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:10:18
 */
public class ClassDemo02 {
    public static void main(String[] args) throws NoSuchMethodException {
        //返回单个公共构造方法
//        method01();
        //获取单个构造方法
//        method02();
        //返回所有构造方法对象数组
//        method03();
        //返回所有公共方法对象
//        method04();
    }

    private static void method04() {
        //获取class对象
        Class clazz = Staff.class;
        //返回所有公共方法对象
        Constructor[] cs = clazz.getConstructors();
        System.out.println(Arrays.toString(cs));
    }

    private static void method03() {
        //获取class对象
        Class clazz = Staff.class;
        //返回所有构造方法对象数组
        Constructor[] dc = clazz.getDeclaredConstructors();
        System.out.println(Arrays.toString(dc));
    }

    private static void method02() throws NoSuchMethodException {
        //获取class对象
        Class clazz = Staff.class;
        //获取单个构造方法
        Constructor dc = clazz.getDeclaredConstructor();
        System.out.println(dc);
    }

    private static void method01() throws NoSuchMethodException {
        //获取class对象
        Class clazz = Staff.class;
        //获取无参构造
        Constructor cs = clazz.getConstructor();
        System.out.println(cs);
        //获取有参构造，顺序需要和构造方法的顺序一致
        Constructor cs2 = clazz.getConstructor(String.class, String.class);
        System.out.println(cs2);
    }
}
