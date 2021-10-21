package DAY24.Demo.Demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:10:43
 */
public class ClassDemo03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        method01();
//        method02();
//        method03();
    }

    private static void method03() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取Class对象
        Class clazz = Staff.class;
        //获取无参构造
        Constructor dc = clazz.getDeclaredConstructor(String.class);
        //被private修饰的成员，不能直接使用
        //如果用反射强行获取并且使用，需要临时取消访问检查
        dc.setAccessible(true);
        Staff staff = (Staff) dc.newInstance("李四");
        System.out.println(staff);
    }

    private static void method02() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取Class对象
        Class clazz = Staff.class;
        //获取公共的无参构造
        Constructor cs = clazz.getConstructor();
        //使用对象
        Staff staff = (Staff) cs.newInstance();
        System.out.println(staff);
    }

    private static void method01() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取Class对象
        Class clazz = Staff.class;
        //获取构造方法 有参
        Constructor cs = clazz.getConstructor(String.class, String.class);
        Staff sta1 = (Staff) cs.newInstance("六四", "14");
        //        System.out.println(sta1);
    }
}
