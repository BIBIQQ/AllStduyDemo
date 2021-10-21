package Day10.pack.edu.info.Manger2.Xinxi;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:15:02
 */
public class NewStudent {

    private String sid;
    private String name;
    private String age;
    private String bir;

    public NewStudent(String sid, String name, String age, String bir) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.bir = bir;
    }

    public NewStudent() {
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

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }
}
