package Day14.Demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:15:43
 */
public class MybubbleSortDemo {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr = {3, 2, 4, 5, 1};

        //一.找到最大值
        // 外层循环控制次数，比数组少一次
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环，控制大小标胶，-1控制不超过最大索引
            // -i 每轮结束，少比较一个数字
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
    }



    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
