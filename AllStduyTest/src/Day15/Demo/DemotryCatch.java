package Day15.Demo;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:16:16
 */
public class DemotryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[10]);
        } catch (Exception e) {
            //返回此throwable的详细信息字符串
            e.getMessage();
            //返回此可抛出的简短描述
            e.toString();
            // 把异常的信息输出到控制台（字体为红色）
            e.printStackTrace();
        }
    }
}
