package Day17.Demo.Demo04;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:11:20
 */
public class Demo04test {
    public static void main(String[] args) {
        //没有定义数据类型的引用
        demo04Impl method = new demo04Impl();
        method.method("你说的好");
        //定义了数据类型的引用
        demo04Impl02 method02 = new demo04Impl02();
        method02.method(19);
    }
}

interface demo04<E> {
    void method(E e);
}

//不定义数据类型
class demo04Impl<E> implements demo04<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

//定义了数据类型
class demo04Impl02 implements demo04<Integer> {

    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}