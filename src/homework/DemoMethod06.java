package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出*/
public class DemoMethod06 {
    public static void main(String[] args) {
        int[] arr = {10000, 1000, 2, 888, 588};
        int[] number_Order = new int[arr.length];
        getRandomOrder(number_Order);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[number_Order[i]-1]+"元的奖金被抽出");
        }
    }

    //需求：在一个数组中存入一个随机不重复的5个数，随机数1-5
    public static void getRandomOrder(int[] number_Order) {
        //需求：在一个数组中存入一个随机不重复的5个数，随机数1-5
        Random r = new Random();
        int a;
        //赋值
        for (int i = 0; i < number_Order.length; i++) {
            a = (r.nextInt(5)+1 );
            //判断是否相同
            for (int j = 0; j < number_Order.length; j++) {
                if (a == number_Order[j]) {
                    a = (r.nextInt(5)+1 );
                    j = -1;
                }
            }
            number_Order[i] = a;
        }

    }
    }


