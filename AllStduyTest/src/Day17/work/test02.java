package Day17.work;

import java.util.Random;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:18:47
 */
/*随机生成8个不重复的10至20之间的随机数并保存Set集合中,然后打印出集合中所有的数据;*/
public class test02 {
    public static void main(String[] args) {
        Random i = new Random();
        //创建TreeList集合
        TreeSet<Integer> list = new TreeSet<>();
        int count = 0;
        while (list.size() < 8) {
            // 随机10-20
            int num = i.nextInt(11) + 10;
            list.add(num);
            count++;
            System.out.println("第" + count + "次生成的随机数是：" + num);
        }
        System.out.println("集合中保存的8个不重复的随机数是：" + list);
    }
}
