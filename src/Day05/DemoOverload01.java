package Day05;
//        1.定义一个数组，用静态初始化完成数组元素初始化
//        2.定义一个方法，对数组进行遍历
//        3.遍历打印的时候，数据不换行
//        4.调用遍历方法
public class DemoOverload01 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        brr(arr);
        System.out.println("我很大");
    }
    public static void brr(int[] arr){
        System.out.print("[");
        for (int i =0 ; i< arr.length;i++){
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
}
