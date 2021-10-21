package DAY24.Demo.Demo02;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:9:43
 */
public   class Staff {
    private String name;
    private String age;
    public  String sex = "男";
    public Staff(String name, String age) {
        System.out.println(name+"__"+age);
        System.out.println("公共");
    }

    public Staff(){
    }
    private Staff(String name){
        System.out.println("私有的的"+name);
    }

    public void method01(){
        System.out.println("公开方法01");
    }
    private void method02(){
        System.out.println("私有方法02");
    }
    private void show(){
        System.out.println("我是"+name);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
