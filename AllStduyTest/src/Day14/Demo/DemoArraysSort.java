package Day14.Demo;

import java.util.Arrays;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:17:12
 */
public class DemoArraysSort {
    public static void main(String[] args) {

    }
//利用二分查找返回指定元素的索引
    private static void binarySearch() {
        int[] arr = {1,2,3,4,5,6};
        int index = Arrays.binarySearch(arr,4);
        System.out.println(index);
    }

    //按照数字的顺序排序指定数组
    private static void sort() {
        int[] arr1 = {2,3,5,6,1,2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
//返回指定数组的内容的字符串表示形式
   private static void ArrtoString() {
        int[] arr = {2,3,5,6,1,2};
        System.out.println(Arrays.toString(arr));
    }

}
