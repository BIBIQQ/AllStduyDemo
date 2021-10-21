package Day06.work;

import java.util.Random;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:21:02
 */
public class DemoTab {
    public static void main(String[] args) {
        //创建一个长度为10的数组
        int [] arr = new int[10];
        Random random = new Random();
        out:
        for (int i = 0; i < arr.length; i++) {
            //今天这个for进来了,你不创建一个不存在的数,就别出去了
            while(true){
                int num =  random.nextInt(12)+15;
                boolean b =  isUsed(num,arr);
                if(b){
                    arr[i] = num ;
                    break ;
                }
            }
        }
        //打印数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static boolean isUsed(int num, int[] arr) {
        //标记的思想
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                flag =false;
            }
        }
        return flag;
    }
}
