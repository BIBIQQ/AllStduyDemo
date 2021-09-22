package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:10:21
 */
public class Object_01 {
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

    public Object_01(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Object_01() {
    }

    @Override
    public String toString() {
        return "Object_01{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Object_01 object_01 = (Object_01) o;

        if (name != null ? !name.equals(object_01.name) : object_01.name != null) return false;
        return age != null ? age.equals(object_01.age) : object_01.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
