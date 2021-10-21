package DAY24.NoteDemo;

import DAY24.EnumDemo.Demo02.Sexs;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:11:37
 */
public class MethodS {

    private static  final Logger log = LoggerFactory.getLogger(MethodS.class);
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取Class对象
        Class<UseAnno> useAnnoClass = UseAnno.class;
        //创建成员对象
        UseAnno o = useAnnoClass.newInstance();
        //获取所有方法的集合
        Method[] methods = useAnnoClass.getDeclaredMethods();
        //遍历方法，判断
        for (Method method : methods) {
            //判断方法中是否有Anno的注释
            if(method.isAnnotationPresent(Anno.class)){
                //执行方法
                method.invoke(o);
            }
        }
    }


    @Test
    public void test(){
        log.debug("debug日志");
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");

    }


}
