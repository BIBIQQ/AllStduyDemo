package Day17.Demo.Demo06_TreeSe;

import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:14:39
 */
public class Demo06_TreeSet {
    public static void main(String[] args) {
        TreeSet<Test> list = new TreeSet<>();
        //新建测试对象
        Test s1 = new Test("xiaoli",10);
        Test s2 = new Test("liuhuang",20);
        Test s3 = new Test("aotemang",30);
        Test s4 = new Test("xiyangyang",110);
        Test s5 = new Test("gaiya",30);
        //TreeSet添加对象
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);


    }
}
