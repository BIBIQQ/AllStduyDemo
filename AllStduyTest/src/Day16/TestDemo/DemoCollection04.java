package Day16.TestDemo;

import Day16.Pack.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:11:12
 */
public class DemoCollection04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("小伟", 11);
        Student stu2 = new Student("小李", 31);
        Student stu3 = new Student("小刘", 22);
        Student stu4 = new Student("小王", 44);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        //普通 for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");

        // 迭代器
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        // 增强for
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("------------------------------");
        // lambda表示式
        list.forEach(c -> System.out.println(c));
    }
}
