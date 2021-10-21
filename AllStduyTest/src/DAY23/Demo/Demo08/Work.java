package DAY23.Demo.Demo08;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:15:52
 */
public class Work {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", age=" + age +
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

    public Work() {
    }

    public Work(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("工人在打工");
    }
}
