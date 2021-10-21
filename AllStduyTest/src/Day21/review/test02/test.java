package Day21.review.test02;

import java.util.Random;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:21:14
 */
/*
 * 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。\
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
 * */
public class test {
    public static void main(String[] args) {
        Random r = new Random();
        TreeSet<Integer> redSet = new TreeSet<>();
//        TreeSet<Integer> buleSet = new TreeSet<>();
        //红色球
        while (redSet.size() < 6) {
            int red = r.nextInt(33) + 1;
            redSet.add(red);
        }
        //蓝色球
        int bule = r.nextInt(16) + 1;

        for (Integer integer : redSet) {
            System.out.print(integer + "  ");
        }
        System.out.println();
        System.out.println(bule);
    }
}
