package Day06.work;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:20:36
 */
public class DemoDieRa {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] =1;
        arr[1] =1;
        for(int i= 2; i< arr.length;i++){

            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[19]);
    }
}
