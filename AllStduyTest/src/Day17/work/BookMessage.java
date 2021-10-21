package Day17.work;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:19:02
 */
public class BookMessage implements Comparable<BookMessage> {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "BookMessage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookMessage() {
    }

    public BookMessage(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public int compareTo(BookMessage o) {
        int result = this.getPrice() - o.getPrice();
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
