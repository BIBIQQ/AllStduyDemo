package Day06;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:16:57
 */
public class DemoArr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int sum = 0;
        //System.out.println(arr[0][1]);
        for(int i= 0;i<arr.length;i++){
            for(int j = 0; j <arr[i].length;j++){
                System.out.println(arr[i][j]);
                sum += arr[i][j];

            }
        }
        System.out.println(sum);
    }
}
