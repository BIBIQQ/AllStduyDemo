package Day19.Work.work02;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:18:29
 */
public class AllSum {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4);

        System.out.println("4个整数的和是：" + sum);
    }

    public static int getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
