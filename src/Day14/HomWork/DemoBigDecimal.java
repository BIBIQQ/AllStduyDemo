package Day14.HomWork;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:18:47
 */
public class DemoBigDecimal {
    public static void main(String[] args) {
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
        BigDecimal sum  = new BigDecimal(0);
        BigDecimal arr = new BigDecimal(0);
        for (int i = 0; i < nums.length; i++) {
            arr = new BigDecimal(nums[i]);
            sum= sum.add(arr);

        }
        System.out.println(sum);
        BigDecimal length = new BigDecimal(nums.length);
        BigDecimal divide = sum.divide(length,2, RoundingMode.HALF_UP);
        System.out.println(divide);

    }
}
