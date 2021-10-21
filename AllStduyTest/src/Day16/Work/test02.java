package Day16.Work;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:19:06
 */
public class test02 {
    public static void main(String[] args) {
        Collection<Double> list = new ArrayList<>();
        //存储数据
        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);

        // 增强for遍历
        System.out.println("使用增强for遍历所有元素，并打印如下：");
        for (Double aDouble : list) {
            System.out.println(aDouble);
        }
        //打印不合格的
        System.out.println("使用增强for遍历所有元素，打印不合格的分数如下：");
        for (Double aDouble : list) {
            if(aDouble <= 60){
                System.out.println(aDouble);
            }
        }
        //求不合格的个数，和不合格的平均分数
        int num = 0;
        double sum = 0;
        for (Double aDouble : list) {
            if(aDouble <= 60){
                num++;
                sum+=aDouble;
            }
        }
        double average = sum/num;
        System.out.println("不合格的分数有："+num+"个，不合格的人平均分是："+" "+average);

        //集合中的最大值
        // 假设最大值为第一个数
        Double max =((ArrayList<Double>) list).get(0);
        for (Double aDouble : list) {
           if(aDouble > max){
               max = aDouble;
           }
        }
        System.out.println("集合中的最大值为："+max);
    }

}
