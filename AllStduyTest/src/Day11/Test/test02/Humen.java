package Day11.Test.test02;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:20:00
 */
public abstract class Humen {
    private String eat;
    public abstract void eat();

    public Humen() {
    }

    public Humen(String eat) {
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
