package Day14.Demo;

import java.util.Objects;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:10:20
 */
public class DemoObject {
    public static void main(String[] args) {
        // toString
        Object_01 s = new Object_01("假面骑士","999");
        Object_01 s1 = new Object_01("假面骑士","999");
        System.out.println(s);
        System.out.println(s == s1);
        System.out.println(s.toString());
        System.out.println(s.equals(s));

        //equals在StringBuilder
        String a = "abc";
        StringBuilder a1 = new StringBuilder("abc");
        System.out.println(a.equals(a1));
        System.out.println(a1.equals(a));

        // Objects的toObject
        String c = null;
        String b = Objects.toString(c, "空");
        System.out.println(b);

        //isnull
        boolean aNull = Objects.isNull("空空");
        System.out.println(aNull);
    }
}
