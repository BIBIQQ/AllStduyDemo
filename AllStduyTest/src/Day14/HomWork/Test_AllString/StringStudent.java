package Day14.HomWork.Test_AllString;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:14:31
 */
public class StringStudent {
    private String name;
    private  int age;
    private double height;
    private boolean marriy;
    private char sex;

    public StringStudent(String name, int age, double height, boolean marriy, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.marriy = marriy;
        this.sex = sex;
    }

    public StringStudent() {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarriy() {
        return marriy;
    }

    public void setMarriy(boolean marriy) {
        this.marriy = marriy;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
