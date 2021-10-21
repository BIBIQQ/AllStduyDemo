package Day19.Work.RandomNum;

import java.util.*;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:19:34
 */
/*随机生成10个10至20之间的随机数(数字允许重复),使用Stream流的技术,找出大于15的元素并打印出来;*/
public class test {
    public static void main(String[] args) {
        Random i = new Random();
        List<Integer> collect = new ArrayList<>();
        int count = 0;
        for (int a = 0; a < 10; a++) {
            int num = i.nextInt(11) + 10;
            count++;
            System.out.println("第" + count + "次生成的随机数是：" + num);
            collect.add(num);
        }
        System.out.print("大于15的元素有：");
        collect.stream().filter(c -> c > 15).forEach(c -> System.out.print(c + "  "));

    }
}
