package Day17.Demo.Demo06_TreeSe;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:15:42
 */
public class Demo06_TreeSet_Comparator {
    public static void main(String[] args) {
        //比较器 Comparator 的方法重写；两个对象对比
        // o1 表示要存入的，o2 表示 集合中已经存在的
        TreeSet<Test02> list = new TreeSet<>(new Comparator<Test02>() {
            @Override
            public int compare(Test02 o1, Test02 o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        //新建测试对象
        Test02 s1 = new Test02("xiaoli", 10);
        Test02 s2 = new Test02("liuhuang", 20);
        Test02 s3 = new Test02("aotemang", 30);
        Test02 s4 = new Test02("xiyangyang", 110);
        Test02 s5 = new Test02("gaiya", 30);
        //TreeSet添加对象
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);
    }
}
