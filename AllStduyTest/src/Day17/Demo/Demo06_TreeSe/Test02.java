package Day17.Demo.Demo06_TreeSe;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:15:42
 */
public class Test02 {
    private String name;
    private int age;

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

    public Test02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test02() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
