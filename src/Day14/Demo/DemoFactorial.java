package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:16:03
 */
public class DemoFactorial {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        // 1-100之间的和
            // 100 + （1 - 99之间的和）
                //99 + （1 - 98之间的和）
                    //。。。
                        // 1
        // 作用：求 1 - i 之间的和
        //如果没有设置出口，会造成栈溢出错误
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);
        }
    }
}
