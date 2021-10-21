package Demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FF
 * @date 2021/10/9
 * @TIME:17:04
 */

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
// 你可以按任意顺序返回答案。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

public class test {
    public static void main(String[] args) {
        int[] arr = {1,3,11,14,5,4};
        int target = 10;


        // O(n^2)
      /* lo: for (int i = 0; i < arr.length; i++) {
            int num =arr[i];
            for (int j =i+1 ;j<arr.length;j++ ){
                int next = arr[j];
                if((num+next)==target ){
                    System.out.println("["+i+","+j+"]");
                    break lo;
                }
            }
        }*/

        //O(1)
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }

        for (int i = 0; i < arr.length; i++) {
            int com = target - arr[i];
            if(map.containsKey(com) && map.get(com) != i){
                System.out.println(i+","+map.get(com));
                break;
            }
        }
        throw new IllegalArgumentException("没有这个数值");
    }
}
