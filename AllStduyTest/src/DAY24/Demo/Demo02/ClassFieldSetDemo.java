package DAY24.Demo.Demo02;

import java.lang.reflect.Field;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:11:39
 */
public class ClassFieldSetDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //获取Class对象
        Class clazz = Staff.class;
        //获取成员变量
        Field field = clazz.getDeclaredField("sex");
        //避免访问
        field.setAccessible(true);
        //获取成员对象
        Staff staff = (Staff)clazz.newInstance();
//        Staff o = (Staff)df.get(staff);
        //设置成员变量
        field.set(staff,"女");
        //获取成员变量
        String  sex =(String) field.get(staff);
        System.out.println(sex);
    }
}
