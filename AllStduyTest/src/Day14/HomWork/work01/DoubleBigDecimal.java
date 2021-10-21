package Day14.HomWork.work01;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:12:55
 */
public class DoubleBigDecimal {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        double sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
           sum+= arr[i];
        }
        System.out.println(sum);
        BigDecimal newSum = new BigDecimal(sum);
        BigDecimal mean = new BigDecimal(arr.length);
        BigDecimal average = newSum.divide(mean,2, RoundingMode.HALF_UP);
        System.out.println(average);
    }
}
