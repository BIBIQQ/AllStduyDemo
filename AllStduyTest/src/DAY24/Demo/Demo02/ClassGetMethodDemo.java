package DAY24.Demo.Demo02;

import java.lang.reflect.Method;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:14:06
 */
public class ClassGetMethodDemo {
    public static void main(String[] args) throws NoSuchMethodException {
//        method01();
//        method02();
    }
    private static void method02() throws NoSuchMethodException {

        //创建Class对象
        Class<Staff> clazz = Staff.class;
        //获取方法method02
        Method method02 = clazz.getDeclaredMethod("method02");
        System.out.println(method02);
    }
    private static void method01() throws NoSuchMethodException {
        //创建Class对象
        Class<Staff> clazz = Staff.class;
        //获取成员方法method01
        Method method01 = clazz.getMethod("method01");
        System.out.println(method01);
    }
}
