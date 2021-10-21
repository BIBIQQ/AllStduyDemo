package Day13.Work.Work01;

import static java.lang.System.*;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:18:32
 */
public class HelloWorld {
    // HelloWorld
    public static void main(String[] args) {
        Outer.method().show();
    }
}
@FunctionalInterface  //函数式接口
interface Inte{
    void show();
}
class Outer{
    //补全代码
    // 将method对象里的方法返回给主方法
    /*public static Inte method(){
        return new Inte() {
            @Override
            public void show() {
                System.out.println("helo");

            }
        };

    }*/
    /*public static Inte method() {
        return ()->{ System.out.println("helo");};
    }*/
    public static Inte method() {
        return ()-> out.println("helo");
    }
}
