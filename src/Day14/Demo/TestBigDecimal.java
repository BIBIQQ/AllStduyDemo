package Day14.Demo;

import java.math.BigDecimal;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:11:22
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        // 输出可以数字也可以字符串
        BigDecimal s1 = new BigDecimal("10.0");
        BigDecimal s2 = new BigDecimal(0.3);
        System.out.println(s1);
        System.out.println(s2);

// 如果需要进行精确运算，使用字符串
        BigDecimal a1 = new BigDecimal("0.6");
        BigDecimal a2 = new BigDecimal("0.3");
        // 加法
        BigDecimal sum = a1.add(a2);
        System.out.println(sum);
        //减法
        BigDecimal subtract = a1.subtract(a2);
        System.out.println(subtract);
        // 乘法
        BigDecimal multiply = a1.multiply(a2);
        System.out.println(multiply);
        // 除法
        BigDecimal divide = a1.divide(a2);
        System.out.println(divide);
// 使用字符串 除不尽的带取舍模式
        BigDecimal i1 = new BigDecimal("0.5");
        BigDecimal i2 = new BigDecimal("0.3");
        // 参数一：参与运算的另一个对象
        // 参数二：精确到小数点后多少位
        // 参数三：舍入模式
//                    进一法 BigDecimal.ROUND_UP
//                        去尾法 BigDecimal.ROUND_FLOOR
//                            四舍五入  BigDecimal.ROUND_HALF_UP
        BigDecimal divide1 = i1.divide(i2, 2, BigDecimal.ROUND_HALF_UP);
        BigDecimal divide2 = i1.divide(i2, 2, BigDecimal.ROUND_UP);
        BigDecimal divide3 = i1.divide(i2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println(divide1);
        System.out.println(divide2);
        System.out.println(divide3);

        Integer i4 = null;
        if (i4 != null) {
            i4 += 200;
            System.out.println(i4);
        }


    }
}
