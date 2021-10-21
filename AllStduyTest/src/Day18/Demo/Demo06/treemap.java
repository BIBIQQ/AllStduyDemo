package Day18.Demo.Demo06;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:10:14
 */
/* Roommates s1 = new Roommates("赵丽颖", 18);
        Roommates s2 = new Roommates("范冰冰", 20);
        Roommates s3 = new Roommates("杨幂", 19);*/
public class treemap {
    public static void main(String[] args) {
        Roommates r1 = new Roommates("赵丽颖", 18);
        Roommates r2 = new Roommates("范冰冰", 20);
        Roommates r3 = new Roommates("赵丽颖", 18);

        TreeMap<Roommates,String> maps = new TreeMap<>(new Comparator<Roommates>() {
            @Override
            public int compare(Roommates o1, Roommates o2) {
                int result = o1.getAge()-o2.getAge();
                result =  result == 0 ? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        maps.put(r1,"11");
        maps.put(r2,"11");
        maps.put(r3,"11");

        maps.forEach((K,V) -> System.out.println(K+V));
    }
}
class Roommates {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Roommates{" +
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

    public Roommates() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Roommates roommates = (Roommates) o;

        if (age != roommates.age) return false;
        return name != null ? name.equals(roommates.name) : roommates.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public Roommates(String name, int age) {
        this.name = name;
        this.age = age;
    }
}