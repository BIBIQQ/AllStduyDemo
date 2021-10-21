package DAY24.Demo.Demo01;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:9:43
 */
public class text {
    public static void main(String[] args) throws ClassNotFoundException {
//        1.Class类中的静态方法forName（“全类名”）
        //全类名：包名+类名
        Class clazz = Class.forName("DAY24.Demo.Demo01.Staff");
        System.out.println(clazz);

//        2.通过class属性来获得
        Class clazz2 = Staff.class;
        System.out.println(clazz2);

//        3.利用对象的getClass方法来获得class对象
//            getClass方法是定义在Object类中
        Staff staff= new Staff();
        Class clazz3 = staff.getClass();
        System.out.println(clazz3);

    }
}
