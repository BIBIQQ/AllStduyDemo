package DAY24.Work.work01;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:18:55
 */
public class Attribute {
    private String name;
    private int age = 0;
    private String gender;
    private int money =0;

    public Attribute(String name, int age, String gender, int money) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
    }

    private Attribute(String name) {
        this.name = name;
    }

    private Attribute() {

    }

    private void getName(String name) {
        System.out.println("设置私有属性name为："+name);
    }
  private  void show(){
      System.out.println(  "Attribute{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", gender='" + gender + '\'' +
              ", money=" + money +
              '}');
  }

}
