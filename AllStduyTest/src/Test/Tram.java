package Test;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:19:18
 */
public class Tram {
    private  String bonus;
    private  int price;
    private  int space;

    public Tram() {
    }

    public Tram(String bonus, int price, int space) {
        this.bonus = bonus;
        this.price = price;
        this.space = space;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "bonus='" + bonus + '\'' +
                ", price=" + price +
                ", space=" + space +
                '}';
    }
}
