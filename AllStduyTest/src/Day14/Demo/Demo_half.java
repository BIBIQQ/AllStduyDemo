package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:15:06
 */
public class Demo_half {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 7;

        int index = binarySerchForIndex(arr, num);
        System.out.println(index);
    }
    public static int binarySerchForIndex(int[] arr, int num) {
        //1.定义查找的范围
        int min = 0;
        int max = arr.length - 1;
//2.循环查找min < =max
        while (min <= max) {
            // 计算出中间的位置 mid
            int mid = (min + max) >> 1;
// mid指向的元素 > number
            if (arr[mid] > num) {
                // 表示要查找的元素在左边
                max = mid - 1;
            } else if (arr[mid] < num) {
                // 表示要查找的元素在右边
                min = mid + 1;
            } else if (arr[mid] == num) {
                return mid;
            }
        }
        //如果大于了max，表示元素不存在。返回-1
        return -1;
    }
}
