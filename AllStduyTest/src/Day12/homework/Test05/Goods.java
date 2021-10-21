package Day12.homework.Test05;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:20:51
 */
public class Goods {
    private String id;
    private String name;
    private int price;
    public Goods(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
