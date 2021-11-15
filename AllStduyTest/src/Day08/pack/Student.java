package Day08.pack;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:15:51
 */
public class Student {
    private String name;
    private  String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
