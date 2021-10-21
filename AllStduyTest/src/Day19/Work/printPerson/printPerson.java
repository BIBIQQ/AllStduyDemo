package Day19.Work.printPerson;

import java.util.HashSet;
import java.util.List;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:19:54
 */
public class printPerson {
    public static void main(String[] args) {
//        导入个人对象
        HashSet<String> person = new HashSet<>(List.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));
//        遍历初始集合
        System.out.println("set集合的原始元素是：" + person);
//        前两个姓张的元素是
        System.out.print("前两个姓张的元素是:");
        person.stream().filter(c -> c.startsWith("张")).limit(2).forEach(c -> System.out.print(c + "  "));
//         跳过第一个姓王的元素是;
        System.out.println();
        System.out.print("跳过第一个姓王的元素是;");
        person.stream().filter(c -> c.startsWith("王")).skip(1).forEach(c -> System.out.print(c + "  "));

    }
}
