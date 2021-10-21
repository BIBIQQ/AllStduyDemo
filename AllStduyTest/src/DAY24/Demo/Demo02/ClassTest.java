package DAY24.Demo.Demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:14:39
 */
public class ClassTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //创建Class
        Class<Staff> clazz = Staff.class;
        // 获取构造方法
        Constructor<Staff> dc = clazz.getDeclaredConstructor();
        //避免访问
        dc.setAccessible(true);
        //创建访问对象
        Staff staff = (Staff) dc.newInstance();
        //调用变量
        Field name = clazz.getDeclaredField("name");
        //避免访问
        name.setAccessible(true);
        //赋值对象
        name.set(staff, "张三");
        //调用方法
        Method show = clazz.getDeclaredMethod("toString");
        //避免访问
        show.setAccessible(true);
        //方法使用
        Object invoke = show.invoke(staff);
        System.out.println(invoke);
    }
}
