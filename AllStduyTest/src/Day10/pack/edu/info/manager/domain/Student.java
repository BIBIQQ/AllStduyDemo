package Day10.pack.edu.info.manager.domain;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:27
 */
public class Student {
    private String sid;
    private String name;
    private String age;
    private String birthday;

    public Student() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Student(String sid, String name, String age, String birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


}
