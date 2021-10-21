package DAY24.Work.work01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:18:54
 */
public class ClassFieldDemo {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        methos01();
      method02();

    }

    private static void method02() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //创建Class对象
        Class<Attribute> clazz = Attribute.class;
        //获取构造方法，构造对象
        Constructor<Attribute> dc = clazz.getDeclaredConstructor();
        //暴力破解，避免访问
        dc.setAccessible(true);
        Attribute lisi = dc.newInstance();
        //获取成员对象
        Method dm = clazz.getDeclaredMethod("getName",String.class);
        //暴力破解，避免访问
        dm.setAccessible(true);
//        //方法使用
        dm.invoke(lisi,"李四");

    }

    private static void methos01() throws NoSuchMethodException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //创建Class对象
        Class<Attribute> clazz = Attribute.class;
        //获取构造方法，构造对象
        Constructor<Attribute> dc = clazz.getDeclaredConstructor();
        //暴力破解，避免访问
        dc.setAccessible(true);
        //获取成员变量
        Field name = clazz.getDeclaredField("name");
        //暴力破解，避免访问
        name.setAccessible(true);
        //获取成员对象
        Attribute attribute = dc.newInstance();
        //变量赋值
        name.set(attribute, "张三");
        //获取成员方法
        Method dm = clazz.getDeclaredMethod("show");
        //暴力破解，避免访问
        dm.setAccessible(true);
        //方法使用
        dm.invoke(attribute);


    }
}
