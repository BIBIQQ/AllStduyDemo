package Day11.Test.test01;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:19:13
 */
//成绩为90分的15岁的李小乐学生,会吃饭(吃学生餐)和学习
public class Student extends Humen{
   private String name;
   private String age;

    public Student(String name, String age, String score, String study) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.study = study;
    }

    public Student(String eat, String name, String age, String score, String study) {
        super(eat);
        this.name = name;
        this.age = age;
        this.score = score;
        this.study = study;
    }

    private String score;
    private String study;

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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public Student() {
    }

    public Student(String eat) {
        super(eat);
    }
}
