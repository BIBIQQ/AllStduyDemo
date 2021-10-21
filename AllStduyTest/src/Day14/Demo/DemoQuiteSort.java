package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:16:49
 */
public class DemoQuiteSort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 5, 4, 3, 2, 1, 8, 9};
        getQuitSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void getQuitSort(int[] arr, int left, int right) {
        if (right < left){
            return;
        }
        int left0 = left;
        int right0 = right;
        //计算出基准数
        int baseNumber = arr[left0];

        while (left != right) {
            //从右开始找
            while (arr[right] >= baseNumber && right > left) {
                right--;
            }
            //从左开始找
            while (arr[right] <= baseNumber && right > left) {
                left++;
            }
            //交换位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        // 基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

    getQuitSort(arr,left0,left-1);
    getQuitSort(arr,left+1,right0);
    }
}
