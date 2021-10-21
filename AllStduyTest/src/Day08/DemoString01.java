package Day08;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:10:36
 */
public class DemoString01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] arr = {'a','b','c'};
        String s2 = new String(arr);
        System.out.println(s2);

        String s3 = new String("abc");
        System.out.println(s3);

        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s2));
    }
}
