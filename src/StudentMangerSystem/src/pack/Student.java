package pack;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:14:44
 */
public class Student {
    private  String name;
    private String age;
    private  String sid;
    private  String birth;

    public Student() {
    }

    public Student(String name, String age, String sid, String birth) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.birth = birth;
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

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sid='" + sid + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
