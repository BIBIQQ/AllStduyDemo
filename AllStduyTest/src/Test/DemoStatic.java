package Test;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:10:24
 */
public class DemoStatic {
    public static void main(String[] args) {
        DemoStaticPack stu = new DemoStaticPack();
        stu.name = "张三";
        stu.age = 19;
//        stu.school = "三";
        DemoStaticPack.school = "五";
        stu.show();


        DemoStaticPack stu1 = new DemoStaticPack();
            stu1.age = 18;
            stu1.name = "李四";
//            stu1.school = "四";
            stu1.show();
    }

}
