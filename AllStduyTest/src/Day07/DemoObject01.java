package Day07;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:10:16
 */
public class DemoObject01 {
    public static void main(String[] args) {
        // 创建对象 数据类型  变量名 = new 数据类型
        Demo01 de = new Demo01( );
        Demo01 de1 = new Demo01("五","女");
// 给遍历变量赋值
        de.setName("liu");
        de.setSex("c");
        // 变量名；
        System.out.println(de.getName());
        System.out.println(de.getSex());

        //  对象名 方法名（）
        de.eat( );



    }
}
