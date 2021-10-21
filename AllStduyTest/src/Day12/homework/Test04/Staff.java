package Day12.homework.Test04;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:20:23
 */
public class Staff {
     int pay;
    String name;

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff(int pay, String name) {
        this.pay = pay;
        this.name = name;
    }

    public Staff() {
    }
    public void show(){
        System.out.println(name+"发"+pay);
    }
}
