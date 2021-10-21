package Test;

/**
 * @author FF
 * @date 2021/9/28
 * @TIME:15:23
 */
public class testExtends <E>{
    void test(E e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        testExtends<? super B>  C = new testExtends<>();
        C.test(new B());
    }
}
class A{}
class B extends A{
    public B() {
    }
}
