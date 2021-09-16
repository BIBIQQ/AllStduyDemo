package Day07.work;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:18:53
 */
public class PhoneTest {
    //定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性
    private String brand;
    private int price;
    private String color;

    public PhoneTest() {
    }

    public PhoneTest(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机打电话");

    }

    public void sendMessag() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机发短信");

    }
}
