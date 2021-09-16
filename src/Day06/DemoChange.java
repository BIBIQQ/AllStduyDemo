package Day06;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:15:54
 */
public class DemoChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,67,7};
          // 交换
        for(int start = 0,end = arr.length-1;start < end ;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
