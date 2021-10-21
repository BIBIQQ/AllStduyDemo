package Day06.work;

/**
 * @author FF
 * @date 2021/9/6
 * @TIME:19:25
 */
public class DemoArrPrint {
    public static void main(String[] args) {
        int[][] arr =  {{11, 22, 33}, {33, 44, 55}};

        for (int i = 0;i < arr.length ;i++){
            for (int j=0; j< arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
