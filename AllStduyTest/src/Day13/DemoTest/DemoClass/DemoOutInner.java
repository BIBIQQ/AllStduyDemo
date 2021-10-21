package Day13.DemoTest.DemoClass;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:10:20
 */
public class DemoOutInner {

    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        System.out.println(i);
        System.out.println(i.num);
        i.show();
    }
}

class Outer{
    static  int a = 10;
    class Inner{
        int num = 20;
        public void show(){
            System.out.println("Inner....show");
            System.out.println(a);
        }
    }

}