package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:14:42
 */
// 将字符串：“92 91 34 52 45 11 23”存于int数组内
public class DemoString_int {
    public static void main(String[] args) {
        String str = "92 91 34 52 45 11 23";
        //获取字符串的每一个数字
        String[] strings =str.split(" ");
        //创建int数组
        int[] num = new int[strings.length];
        //把String数组转换存于int数组
        for (int i = 0; i < strings.length; i++) {
            int number = Integer.parseInt(strings[i]);
            num[i]= number;
        }
//遍历数组
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
//        System.arraycopy(str,0,num,0,str.length());

    }
}
