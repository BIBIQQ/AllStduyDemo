package DAY24.Demo.Demo02;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:11:26
 */
public class ClassFieldDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        method01();
//        method02();
//        method03();
//        mothod04();
    }

    private static void mothod04() {
        //获取Class对象
        Class<Staff> clazz = Staff.class;
        //获取所有成员变量数组对象
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
    }

    private static void method03() {
        //获取Class对象
        Class<Staff> clazz = Staff.class;
        //获取所有公共成员变量对象的数组
        Field[] fields = clazz.getFields();
        System.out.println(Arrays.toString(fields));
    }

    private static void method02() throws NoSuchFieldException {
        //获取Class对象
        Class<Staff> clazz = Staff.class;
        //获取私有成员变量
        Field field = clazz.getDeclaredField("name");
        System.out.println(field);
    }

    private static void method01() throws NoSuchFieldException {
        //获取Class对象
        Class<Staff> clazz = Staff.class;
        //获取的成员变量必须是真实存在的
        //且必须是public修饰的
        //获取name的成员变量
        Field field = clazz.getField("sex");
        System.out.println(field);
    }
}
