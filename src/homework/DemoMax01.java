package homework;

public class DemoMax01 {
    public static void main(String[] args) {
        // 初始化一个数组
        int[] arr = {1,2,3,4,45};
        int max = brr(arr);
        int sum = printArrSum(  arr);
        System.out.println(max);
        System.out.println(sum);
    }
    // 查找数组中的最大值
    public static int brr(int[] arr){
        // 假设最大值为第一个
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i]){
                max = arr[i];
            }
        }
        // 返回 最大值
        return max;
    }

    // 打印元素和
    public static int  printArrSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 返回总和
        return sum;
    }


}
