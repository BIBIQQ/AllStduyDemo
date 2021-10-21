package DAY24.Work.work02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:19:30
 */
public class Person {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        FileReader fileReader = new FileReader("src\\DAY24\\Work\\work02\\conf.properties");
        BufferedReader br = new BufferedReader(fileReader);
        Properties pro = new Properties();
        //读取文件
        pro.load(br);
        System.out.println(pro);
        fileReader.close();
        //获取数值
        //构造Class方法
        Class clazz = Class.forName((String) pro.get("ClassName"));
//        Class clazz = Class.forName("DAY24.Work.work02.per");
        Constructor dc = clazz.getDeclaredConstructor();
        dc.setAccessible(true);
        Object user = dc.newInstance();
        //获取name和age   user password
        Set<Object> keys = pro.keySet();
        for (Object key : keys) {
            Field field = null;
            try {
                //判断一下，没有返回值的话，返回的是异常，而不是null
                field = clazz.getDeclaredField((String) key);

                if (field == null) {
                    continue;
                }
            } catch (NoSuchFieldException e) {
                continue;
            }
            field.setAccessible(true);

            field.set(user, (String) pro.get(key));
        }
        System.out.println(user);
    }
}
