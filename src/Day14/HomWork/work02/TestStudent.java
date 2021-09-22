package Day14.HomWork.work02;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:13:26
 */
public class TestStudent {
    String name;
    String sex;
    String age;
    double score;

    public TestStudent(String name, String sex, String age, double score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public TestStudent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
