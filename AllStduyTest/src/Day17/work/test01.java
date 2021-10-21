package Day17.work;

import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:18:41
 */
/*已知数组信息如下:

{2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6}

请使用代码找出上面数组中的所有的数据,要求重复的数据只能保留一份;
*/
public class test01 {
    public static void main(String[] args) {
        //创建目标数组
        double[] arr = {2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6};
        //创建TreeList集合
        TreeSet<Double> list = new TreeSet<>();
        // 遍历数组，存入集合
        for (double v : arr) {
            list.add(v);
        }
        // 输出集合
        System.out.println("去除重复元素后，结果是："+list);
    }
}
