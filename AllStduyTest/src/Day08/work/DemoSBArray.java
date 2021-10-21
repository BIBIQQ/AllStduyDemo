package Day08.work;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:19:12
 */
public class DemoSBArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        StringBuilder sb = new StringBuilder();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }

        }
        String brr = sb.toString();
        System.out.println(brr);
    }

}
