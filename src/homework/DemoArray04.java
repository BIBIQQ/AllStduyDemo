package homework;

public class DemoArray04 {
    public static void main(String[] args) {
        int num = 0;
        // 获得每个元素
        int[] arr = new int[]{1,2,3,5};
        for(int i = 0 ; i < arr.length;i++){
            //让数组的最后一个元素代表个位，倒数第二个元素代表十位，以此类推
            num = arr[arr.length-3]*100+arr[arr.length-2]*10+arr[arr.length-1];
        }
        System.out.println(num);
    }
}
