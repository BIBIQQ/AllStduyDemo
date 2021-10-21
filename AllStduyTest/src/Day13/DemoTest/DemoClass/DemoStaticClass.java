package Day13.DemoTest.DemoClass;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:10:28
 */
public class DemoStaticClass {
    public static void main(String[] args) {
        Newouter.Inner oi = new Newouter.Inner();
        oi.show();
        Newouter.Inner.method();
    }
}
class Newouter{
   static class Inner{
        public void  show(){
            System.out.println("inner....show");

        }
   public static void method(){
       System.out.println("innner...method");
   }
   }
}