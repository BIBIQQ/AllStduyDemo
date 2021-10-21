package Day14.HomWork.DemoArrays;

import java.util.Arrays;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:13:43
 */
public class DemoSort {
    public static void main(String[] args) {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
