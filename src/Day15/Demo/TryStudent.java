package Day15.Demo;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:16:59
 */
public class TryStudent {
    private String name;
    private int age;

    public TryStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TryStudent() {
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

        if (age >=18 && age<=25) {
            this.age = age;
        }else{
            throw  new AgeOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "TryStudent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
