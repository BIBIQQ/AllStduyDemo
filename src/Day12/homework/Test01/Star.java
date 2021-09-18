package Day12.homework.Test01;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:18:44
 */
public class Star {
    String name;
    String age;

    public Star(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Star() {
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

    public  void   show(){
        System.out.println("我是明星xxx,今年我xxx岁");
    }
}
