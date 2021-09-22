package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:14:35
 */
public class DemoParseInt {
    public static void main(String[] args) {
        String s1 = "100";
        int i1 =200;
        System.out.println(s1+i1);//字符串+任意数都是字符串

        int i2 = Integer.parseInt(s1);  // 字符串变成int整数
        System.out.println(i2+i1);

        //int -.> String
        String s2 = i1 +" ";
        System.out.println(s2+100);

        //使用String的静态方法valueOf()
        String s3 = String.valueOf(i1);
        System.out.println(s3+100);
    }
}
