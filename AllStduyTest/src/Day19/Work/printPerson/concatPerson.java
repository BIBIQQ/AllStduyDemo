package Day19.Work.printPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:20:05
 */
public class concatPerson {
    public static void main(String[] args) {
//        导入元素
        ArrayList<String> person = new ArrayList<>(List.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));
        System.out.println("set集合的原始元素是：" + person);
//        搜索条件，建立两个stream流
        Stream<String> stream1 = person.stream().filter(c -> c.startsWith("张"));
        Stream<String> stream2 = person.stream().filter(c -> c.startsWith("王"));
//        合并两个流  统计数量
        long count = Stream.concat(stream1, stream2).filter(c -> c.length() == 3).count();
        System.out.println("姓张和姓王的并且名字是3个字的人共有：" + count + "个");
    }
}
