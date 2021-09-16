package Day11;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:10:22
 */
public class DemoFu extends  DemoYe {
    String name;
    String age;

    public DemoFu() {
    }

    public DemoFu(String name, String age) {
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
