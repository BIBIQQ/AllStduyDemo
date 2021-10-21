package Day11;
/**
 * @author FF
 * @date 2021/9/15
 * @TIME:10:22*/
public class DemoZi extends DemoFu{
private String score;

    public DemoZi(String score) {
        this.score = score;
    }

    public DemoZi(String name, String age, String score) {
        super(name, age);
        this.score = score;
    }

    public DemoZi() {
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
