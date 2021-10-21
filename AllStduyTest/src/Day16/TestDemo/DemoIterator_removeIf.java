package Day16.TestDemo;

import Day16.Pack.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:11:46
 */
public class DemoIterator_removeIf {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 22);
        Student stu2 = new Student("李三", 26);
        Student stu3 = new Student("张崔", 38);
        Student stu4 = new Student("赵三", 19);
        Student stu5 = new Student("张三封", 103);
        Student stu6 = new Student("赵三", 16);

        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);

        list.removeIf(student -> {
            if (student.getName().startsWith("张") && student.getAge() >= 18) {
                return false;
            }
            return true;
        });
        System.out.println(list);

        Iterator<Student> it = list.iterator();

        while (it.hasNext()){
            Student student = it.next();
            if(student.getName().startsWith("张") && student.getAge() >= 18){
                System.out.println(student);
            }
        }
        int[] arr = {1,2,3,4};
        
    }
}