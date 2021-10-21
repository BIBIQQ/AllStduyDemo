package Day17.Demo.Demo07;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:16:05
 */
public class News {
    private String name;
    private int heat;

    public News() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public News(String name, int heat) {
        this.name = name;
        this.heat = heat;
    }

    @Override
    public String toString() {
        return
                "新闻'" + name + '\'' +
                ", 热度   " + heat +
                ' ';
    }
}
