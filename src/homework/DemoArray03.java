package homework;

import java.sql.SQLOutput;
import java.util.Random;

public class DemoArray03 {
    public static void main(String[] args) {
        int sum = 0;
        // 生成6个随机数
        for(int i = 0;i < 6;i++){
            Random num = new Random();
            int a = num.nextInt(100);
            //System.out.println(a);
            int[] arr = new int[6];
            arr[i] = a;
            System.out.print(arr[i]+" ");
            sum += a;
        }
        System.out.println("数组和为"+sum);
    }

}
