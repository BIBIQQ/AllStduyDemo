package Day06.work;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:19:20
 */
public class DemoArrChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int start = 0,end = arr.length-1; start < end ; start++,end--) {
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp ;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
