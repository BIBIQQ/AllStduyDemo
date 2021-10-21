package Day11.Test.test02;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:20:01
 */
//18岁的演员景甜会吃饭(吃小龙虾)和跳舞
public class Actor extends Humen{
    private String name;
    private String age;
    private String dance;
    private String Occupation;


    @Override
    public void eat() {
        setEat("吃小龙虾");
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

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public Actor(String name, String age, String dance, String occupation) {
        this.name = name;
        this.age = age;
        this.dance = dance;
        Occupation = occupation;
    }

    public Actor(String eat, String name, String age, String dance, String occupation) {
        super(eat);
        this.name = name;
        this.age = age;
        this.dance = dance;
        Occupation = occupation;
    }

    public Actor() {
    }

    public Actor(String eat) {
        super(eat);
    }

}
