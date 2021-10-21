package DAY24.Demo.Demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:14:29
 */
public class ClassMethodUser {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //创建Class对象
        Class clazz = Staff.class;
        //构造成员方法
        Constructor dc = clazz.getDeclaredConstructor();
        //避免访问
        dc.setAccessible(true);
        //调用方法
        Method method02 = clazz.getDeclaredMethod("method02");
        //避免访问
        method02.setAccessible(true);
        //创建Staff对象
        Staff staff = (Staff) dc.newInstance();
        method02.invoke(staff);
    }
}
