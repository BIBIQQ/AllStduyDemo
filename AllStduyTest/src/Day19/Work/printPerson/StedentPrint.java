package Day19.Work.printPerson;

import java.util.*;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:20:13
 */
/*本题综合单列集合,双列集合,键盘输入,Stream流操作

1.键盘录入3个学生信息,存储到学生对象(姓名,年龄).然后添加到ArrayList集合中.
2.键盘录入3个居住地信息,添加到另一个集合ArrayList;
3.把两个list集合中的数据收集到同一个map集合中,键是学生对对象,值是居住地址.
4.要求map集合中不能存在相同的学生信息.并按照学生年龄降序排列

5.使用Stream流输出集合中所有姓张的人信息;
*/
public class StedentPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stulist = new ArrayList<>();
        ArrayList<String> stuAdr = new ArrayList<>();
        Map<Student, String> treeStu = new TreeMap<>();
        //预设输入学生个数
        int count = 3;
//        输入学生信息
        for (int i = 0; i < count; i++) {
            System.out.println("输入第" + (i + 1) + "个学生姓名");
            String name = sc.next();
            System.out.println("输入第" + (i + 1) + "个学生年龄");
            int age = sc.nextInt();
            Student stu = new Student(name, age);
            stulist.add(stu);
        }
//        输入学生地址
        for (int i = 0; i < count; i++) {
            System.out.println("输入第" + (i + 1) + "个学生地址");
            String ad = sc.next();
            stuAdr.add(ad);
        }
//        将学生信息和学生地址存入Map集合
        for (int i = 0; i < count; i++) {
            treeStu.put(stulist.get(i), stuAdr.get(i));
        }

        treeStu.keySet().stream().filter(c -> c.getName().startsWith("张"))
                .forEach(c -> System.out.println(c + "  地址：" + treeStu.get(c)));


    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "学生信息：" +
                "姓名：" + name + '\'' +
                ", 年龄：" + age +
                "\'";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        int result = o.getAge() - this.getAge();
        result = result == 0 ? o.getName().compareTo(this.getName()) : result;
        return result;
    }
}