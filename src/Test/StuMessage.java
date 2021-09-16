package Test;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:19:44
 */
public class StuMessage {
    private String name;
    private int language;
    private int math;

    public StuMessage() {
    }

    public StuMessage(String name, int language, int math) {
        this.name = name;
        this.language = language;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "StuMessage{" +
                "name='" + name + '\'' +
                ", language=" + language +
                ", math=" + math +
                '}';
    }
    public void show(){
        System.out.println(name+"的语文成绩是"+language+"分，数学成绩是"+math+"分，总分是"+(language+math)+"分。");
    }
}
