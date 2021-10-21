package TestSE_10_10.test01;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:19:31
 */

/*、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序*/
public class test {
    public static void main(String[] args) {
        TreeSet<Student> stu = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = (int) (o2.getSocre()*10 - o1.getSocre()*10);
                result = result == 0 ? o1.getAge() - o2.getAge():result;
                return result;
            }
        });
        stu.add(new Student("lihua",20,99.5));
        stu.add(new Student("lisi",22,90.0));
        stu.add(new Student("wangwu",20,99.0));
        stu.add(new Student("sunliu",22,100.0));

        System.out.println(stu);

    }
}
