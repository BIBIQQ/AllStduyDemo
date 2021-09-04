package Day05;
//        1.定义一个数组，用静态初始化完成数组元素初始化
//        2.定义一个方法，用来获取数组中的最大值
//        3.调用获取最大值方法，用变量接收返回结果
//        4.把结果输出在控制台

public class DemoMethod02 {
    public static void main(String[] args) {
        //        1.定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {1, 2, 3, 4, 4, 1, 5};
        int max = brr(arr);
        System.out.println(max);
    }
    //        2.定义一个方法，用来获取数组中的最大值
    public static int brr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //        3.调用获取最大值方法，用变量接收返回结果
        return max;
    }
}
