package DAY24.EnumDemo.Demo01;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:10:25
 */
public class EnumDemo {
    public static void main(String[] args) {
        //枚举项名字
        String name = Seasong.SPRING.name;
        String name1 = Seasong.SUMMER.name;
        System.out.println(name);
        System.out.println(name1);

//  返回枚举项索引
        int index1 = Seasong.SPRING.ordinal();
        int index2 = Seasong.SUMMER.ordinal();
        int index3 = Seasong.AUTUMN.ordinal();
        int index4 = Seasong.WINTER.ordinal();
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        //枚举项索引差值
        int i = Seasong.SPRING.compareTo(Seasong.WINTER);
        System.out.println(i);
        //输出枚举项名字
        String string = Seasong.SPRING.toString();
        System.out.println(string);
        //指定枚举项
        Seasong spring = Enum.valueOf(Seasong.class, "SPRING");
        System.out.println(spring);
        System.out.println(Seasong.SPRING == spring);
        //所有枚举项
        Seasong[] values = Seasong.values();
        for (Seasong value : values) {
            System.out.println(value);
        }

    }

}
