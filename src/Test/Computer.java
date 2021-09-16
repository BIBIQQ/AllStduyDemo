package Test;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:10:45
 */
public class Computer {
    private  String bonus;
    private int price;

    public Computer(String bonus, int price) {
        this.bonus = bonus;
        this.price = price;
    }

    public Computer() {
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
}
