package Day16.Work;

import Day16.Pack.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:19:24
 */
public class test03 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 22);
        Student stu2 = new Student("李四", 26);
        Student stu3 = new Student("张翠山", 38);
        Student stu4 = new Student("赵六", 19);
        Student stu5 = new Student("张三封", 103);
        Student stu6 = new Student("张无忌", 17);
        Student stu7 = new Student("赵敏", 16);
// 存储数据
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);
        list.add(stu7);

        //迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student a = it.next();
            if (a.getName().startsWith("张") && a.getAge() > 18) {
                System.out.println(a);
            }
        }
        System.out.println("----------------------------------------");
        //removeIf
        list.removeIf(a -> {
            if (a.getName().startsWith("张") && a.getAge() > 18) {
                return false;
            }
            return true;
        });
        list.forEach(c -> System.out.println(c));
    }
}
