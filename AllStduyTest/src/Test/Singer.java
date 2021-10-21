package Test;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:18:59
 */
public class Singer {
    private String name;
    private int age;
    private String like;

    public Singer() {
    }

    public Singer(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                '}';
    }
}
