package Day16.Pack;

/**
 * @author FF
 * @date 2021/9/24
 * @TIME:9:53
 */
public class Menu {
    private String cook;

    public Menu() {
    }

    public Menu(String cook) {
        this.cook = cook;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "cook='" + cook + '\'' +
                '}';
    }
}
