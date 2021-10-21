package Day18.PDD;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:20:06
 */
public class Person {
    private String name;
    private  int price;
    private int surplus;

    @Override
    public String toString() {
        double  price1 = price/100.0;
        double  surplus1 = surplus/100.0;
        return "这个用户：" +
                 name + '\'' +
                "即将获得" + price1 +
                ", 已经砍了" + surplus1 +"块，快喊兄弟来砍！！！"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (price != person.price) return false;
        if (surplus != person.surplus) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + surplus;
        return result;
    }

    public Person() {
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

    public int getSurplus() {
        return surplus;
    }

    public void setSurplus(int surplus) {
        this.surplus = surplus;
    }

    public Person(String name, int price, int surplus) {
        this.name = name;
        this.price = price;
        this.surplus = surplus;
    }
}
