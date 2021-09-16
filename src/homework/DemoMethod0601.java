package homework;

import java.util.Random;

/*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出*/
public class DemoMethod0601 {
    public static void main(String[] args) {
        // 定义一个抽过奖的奖池
       int[] arr=  {2,588,888,1000,10000};
       getArrBonus(arr);


    }
    // 随机输出数组值
    public static void getArrBonus(int[] arr){
        int[] brr= new int[arr.length];
        // 随机
        Random bonus = new Random();

        for(int j = 0; j < arr.length;j++){
            //随机生成奖池奖金
            int i = bonus.nextInt(arr.length);
                // 判断是不是相同
                if (brr[i] != arr[i]) {
                    brr[i] = arr[i];
                    System.out.println(brr[i]+"元的奖池被抽出");
            }else{
                    j--;
                }
        }
    }
}
