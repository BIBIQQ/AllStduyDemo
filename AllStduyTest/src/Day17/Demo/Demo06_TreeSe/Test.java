package Day17.Demo.Demo06_TreeSe;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:14:40
 */
public class Test implements Comparable<Test> {
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

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //自然排序  Compareable
    @Override
    public int compareTo(Test o) {
        //主要条件
        int result = this.age - o.age;
        //次要条件
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
