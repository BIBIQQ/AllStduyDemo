package Day08.work;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:21:11
 */
/*/*1.分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数*/
public class DemoArr01 {
    public static void main(String[] args) {
        String[] arr = {"010","3223","666","7890987","123123"};
        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];
            StringBuilder brr = new StringBuilder(a);
            String newA = brr.reverse().toString();
            if (newA.equals(a)) {
                System.out.println(a + "是对称的");
            } else{
            System.out.println(a + "不是对称的");
        }
        }
    }
}
