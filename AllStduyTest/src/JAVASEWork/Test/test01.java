package JAVASEWork.Test;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:18:54
 */
//.编写Java程序，模拟学生信息管理系统。、
// 有多个班级，每个班级中有多位学员，创建班级和学员，
// 存入合适的集合中，实现班级按班级id排序和每个班级中学员按分数排序,如果分数相同，按姓名排
public class test01 {
    public static void main(String[] args) {
        Class c1 = new Class(1, "Java1班");
        Class c2 = new Class(2, "Java2班");
        Class c3 = new Class(3, "Java3班");

        Student s1 = new Student("王五", "wangwu", 80);
        Student s2 = new Student("李四", "lisi", 82);
        Student s3 = new Student("张三", "zhangsan", 83);
        TreeSet<Student> stu = new TreeSet<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        TreeMap<Class, TreeSet> room = new TreeMap<>((o1, o2) -> {
            int result = o1.getId() - o2.getId();
            return result;
        });
        room.put(c1, stu);
        room.put(c2, stu);
        room.put(c3, stu);

        room.forEach((K, V) -> {
            System.out.println(K);
            System.out.println(V);
            /*V.forEach(c-> System.out.println(c))*/;
        });
    }
}

//学生
class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String Cname;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Cname='" + Cname + '\'' +
                '}';
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

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Student(String name, String cname, int age) {
        this.name = name;
        this.age = age;
        Cname = cname;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getAge() - o.getAge();
        result = result == 0 ? this.getCname().compareTo(o.getCname()) : result;
        return result;
    }
}

//教室
class Class implements Comparable<Class> {
    private int id;
    private String className;

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Class() {
    }

    public Class(int id, String className) {
        this.id = id;
        this.className = className;
    }

    @Override
    public int compareTo(Class o) {
        int result = this.getId() - o.getId();
        result = result == 0 ? this.getClassName().compareTo(o.getClassName()) : result;
        return result;
    }
}
