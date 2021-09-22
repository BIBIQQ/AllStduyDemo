package Day14.Demo;

/**
 * @author FF
 * @date 2021/9/20
 * @TIME:11:41
 */
public class DemoInteger {
    public static void main(String[] args) {
        //Integer是int的包装类
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //返回表示指定int值的Integer实例
        Integer i = Integer.valueOf(200);
        //返回表示保存指定值的Integer对象String
        Integer i1 = Integer.valueOf("200");

        Integer i2= 100;
//       对象 = 默认是一个基本数据类型
        System.out.println(i2);

        int i3 = i2;
    }
}
