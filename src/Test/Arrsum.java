package Test;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:20:21
 */
public class Arrsum {
    public static void main(String[] args) {
        int[] nums = {2,3,7,15};
        int target = 9;
        out:
        for (int i = 0; i < nums.length;i++) {

            for (int j = 0;j <nums.length;j++) {

                    if(nums[i]+nums[j]== target){
                        System.out.println("["+i+","+j+"]");
                    break out;


                }

            }

        }
    }
}
