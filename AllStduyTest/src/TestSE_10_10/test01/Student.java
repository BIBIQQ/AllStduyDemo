package TestSE_10_10.test01;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:19:32
 */
public class Student implements Comparable<Student>{
private String name;
private int age;
private double socre;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", socre=" + socre +
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

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }

    public Student() {
    }

    public Student(String name, int age, double socre) {
        this.name = name;
        this.age = age;
        this.socre = socre;
    }

    @Override
    public int compareTo(Student o) {
        int result= (int) (o.getSocre()-this.getSocre());
        result = result ==0 ? this.getAge()-o.getAge():result;
        return result;
    }
}
