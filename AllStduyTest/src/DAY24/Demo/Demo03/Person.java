package DAY24.Demo.Demo03;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:14:02
 */
public class Person {
    private String name;
    private String age;
    private String sex;

    private Person() {
    }

    private Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void show(){
        System.out.println("无参方法"+name);
    }
    private void setName(String name){
        System.out.println("有参方法"+name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
