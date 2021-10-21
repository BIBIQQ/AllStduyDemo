package Day17.BaiduSeach;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:20:07
 */
public class News   {
    private String message;
    private int heat;

    @Override
    public String toString() {
        return "新闻：" + message + '\'' +
                ", 热度：" + heat ;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public News() {
    }

    public News(String message, int heat) {
        this.message = message;
        this.heat = heat;
    }


}
