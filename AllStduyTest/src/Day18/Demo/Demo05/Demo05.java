package Day18.Demo.Demo05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:17:13
 */
public class Demo05 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();

        Student s1 = new Student("xiaohong",18);
        Student s2 = new Student("liuxiang",19);
        Student s3 = new Student("zhangliang",18);

        map.put(s1,"上海");
        map.put(s2,"宁波");
        map.put(s3,"杭州");

        //第一种
        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            String s = map.get(key);
            System.out.println(key+s);
        }
        System.out.println("==============");
        //第二种
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
        System.out.println("==============");
        //第三种
        map.forEach((k,v)-> System.out.println(k+v));
    }
}
