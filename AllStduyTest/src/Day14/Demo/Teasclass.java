package Day14.Demo;

import java.util.Objects;

/**
 * @author FF
 * @date 2021/9/19
 * @TIME:17:23
 */
public class Teasclass {
    String name;
    String age;

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

    public Teasclass(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Teasclass() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teasclass teasclass = (Teasclass) o;
        return Objects.equals(name, teasclass.name) &&
                Objects.equals(age, teasclass.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Teasclass{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
