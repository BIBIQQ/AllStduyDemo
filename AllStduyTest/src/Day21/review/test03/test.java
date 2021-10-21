package Day21.review.test03;

import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:21:14
 */
/*
 * 分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序
 * ，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
 * */
public class test {
    public static void main(String[] args) {
        Student s1 = new Student("liusan", 20, 90);
        Student s2 = new Student("lisi", 22, 90);
        Student s3 = new Student("wangwu", 20, 99);
        Student s4 = new Student("masan", 22, 100);

        TreeSet<Student> tr = new TreeSet<>();
        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        tr.add(s4);
        System.out.println(tr);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int result = o.getScore() - this.getScore();
        result = result == 0 ? this.getAge() - o.getAge() : result;

        return result;
    }
}