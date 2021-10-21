package Day16.Work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:18:49
 */
public class test01 {
    public static void main(String[] args) {
       Collection<String> list = new ArrayList<>();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");
        // 遍历数组
        Ierate(list);
        //找小于10字符的
        Found(list);
        //书名包含“Java”的元素
        Foundjava(list);
        //书名剔除“Oracle”的元素
        ClearOracle(list);
    }

    public static void ClearOracle(Collection<String> list) {
        //书名剔除“Oracle”的元素
        System.out.println("---------书名剔除“Oracle”的元素如下---------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.contains("Oracle")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void Foundjava(Collection<String> list) {
        System.out.println("---------书名包含“Java”的元素如下---------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.contains("Java")){
                System.out.println(str);
            }
        }
    }

    public static void Found(Collection<String> list) {
        //找小于10字符的
        System.out.println("---------书名小于10个字符的元素如下---------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.length() < 10){
                System.out.println(str);
            }
        }
    }

    public static void Ierate(Collection<String> list) {
        // 遍历数组
        System.out.println("---------所有元素如下---------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
