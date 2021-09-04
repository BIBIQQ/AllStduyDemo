package homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DemoArray06 {
    public static void main(String[] args) {
        int index = 0;
        // 输出一个数
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int index = 0;
        // 定义一个数组
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr1 = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (a >= arr[i]) {
                arr1[i] = arr[i];
                index++;
            }else {
                arr1[i+1] = arr[i];
            }

        }
        arr1[index] = a ;

        for (int i=0 ; i < arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}


