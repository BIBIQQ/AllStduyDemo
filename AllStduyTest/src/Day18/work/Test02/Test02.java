package Day18.work.Test02;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:18:56
 */
/*假如你有3个室友,请使用HashSet  和 TreeSet 集合保存3个室友的信息;

信息如下:

赵丽颖,18

范冰冰,20

杨幂,19

要求:

1:室友以对象形式存在,包含姓名和年龄两个属性;

2:使用代码保证集合中同名同年龄的对象只有一份;(相同姓名和年龄的对象认为是同一个对象)
*/
public class Test02 {
    public static void main(String[] args) {
        Roommates s1 = new Roommates("赵丽颖", 18);
        Roommates s2 = new Roommates("范冰冰", 20);
        Roommates s3 = new Roommates("杨幂", 19);

        HashSet<Roommates> hash = new HashSet<>();

        hash.add(s1);
        hash.add(s2);
        hash.add(s3);

        System.out.println(hash);

        TreeSet<Roommates> treeSet = new TreeSet<>(new Comparator<Roommates>() {
            @Override
            public int compare(Roommates o1, Roommates o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        System.out.println(treeSet);
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