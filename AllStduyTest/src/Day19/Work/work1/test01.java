package Day19.Work.work1;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:16:57
 */
public class test01 {
    public static void main(String[] args) {
        ArrayList<wumen> list = new ArrayList<>();
        list.add(new wumen("赵丽颖", 18));
        list.add(new wumen("范冰冰", 28));
        list.add(new wumen("杨幂", 20));
        list.add(new wumen("王冰冰", 17));

        Map<String, Integer> maps = list.stream().collect(Collectors.toMap(s -> s.getName(), b -> b.getAge()));
        System.out.println(maps);
    }
}

class wumen {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "wumen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public wumen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public wumen() {
    }
}