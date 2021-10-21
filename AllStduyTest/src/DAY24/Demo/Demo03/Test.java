package DAY24.Demo.Demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:14:02
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> clazz = Person.class;
//        method01(clazz);
        Constructor<Person> dc = clazz.getDeclaredConstructor(String.class,String.class,String.class);
        dc.setAccessible(true);
        Person person = dc.newInstance("你好","12","男");
        System.out.println(person);


    }

    private static void method01(Class<Person> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<Person> dc = clazz.getDeclaredConstructor();
        dc.setAccessible(true);
        Person person = dc.newInstance();
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        setName.setAccessible(true);
        setName.invoke(person,"你好");
    }
}
