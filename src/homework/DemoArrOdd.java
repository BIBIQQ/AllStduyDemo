package homework;
//定义一个新数组。把原数组的奇数放在新数组的左边，把原数组的偶数放在新数组的右边
public class DemoArrOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] brr = getOdd(arr);
        for (int i =0;i < brr.length ;i++){
            System.out.print(brr[i]+" ");
        }
    }
    public static int[] getOdd(int[] arr){
        int[] brr = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        for(int i = 0; i < arr.length ;i++){
            if(arr[i] %2 == 0){
                brr[right] = arr[i];
                right--;
            }else{
                brr[left] = arr[i];
                left++;
            }
        }
        return brr;
    }
}
