package Day10.pack.edu.info.manager.domain;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:19:21
 */
public class Teacher {
    private String tid;
    private String name;
    private String age;
    private String birthday;

    public Teacher() {
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    public Teacher(String tid, String name, String age, String birthday) {
        this.tid = tid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
