package Day13.DemoTest.DemoClass;

import java.sql.SQLOutput;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:10:25
 */
public class DemoPrivtaClass {
    public static void main(String[] args) {
        Cuter o = new Cuter();
        o.method();
    }
}
class Cuter{
    private class Inner{
        public void show(){
            System.out.println("inner..show");
        }
    }
    public  void method (){
        Inner i = new Inner();
        i.show();
    }
}