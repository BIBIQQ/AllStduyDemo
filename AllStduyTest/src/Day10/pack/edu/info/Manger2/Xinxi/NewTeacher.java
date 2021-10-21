package Day10.pack.edu.info.Manger2.Xinxi;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:16:58
 */
public class NewTeacher {
    private  String tid;
    private String name;
    private String age;
    private String bir;

    public NewTeacher() {
    }

    public NewTeacher(String tid, String name, String age, String bir) {
        this.tid = tid;
        this.name = name;
        this.age = age;
        this.bir = bir;
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

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }
}
