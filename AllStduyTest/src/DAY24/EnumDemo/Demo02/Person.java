package DAY24.EnumDemo.Demo02;

import java.time.Month;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:10:42
 */
public class Person {
    private String name;
    private Sexs Sex;
    private Month month;
    private MonthDay Day;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sexs getSex() {
        return Sex;
    }

    public void setSex(Sexs sex) {
        Sex = sex;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public MonthDay getDay() {
        return Day;
    }

    public void setDay(MonthDay day) {
        Day = day;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, Sexs sex, Month month, MonthDay day, String age) {
        this.name = name;
        Sex = sex;
        this.month = month;
        Day = day;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Month='" + month + '\'' +
                ", Day='" + Day + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
