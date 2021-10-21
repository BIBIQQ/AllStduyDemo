package Day19.Demo.Demo01;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:10:30
 */
public class Test01 {
    public static void main(String[] args) {
        int sum = getSum(2, 2, 3, 4);
        System.out.println(sum);
    }

    // 可变参数
//    添加新参数，必须放在可变参数前面
    public static int getSum(int num, int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum += num;
        return sum;
    }
}
