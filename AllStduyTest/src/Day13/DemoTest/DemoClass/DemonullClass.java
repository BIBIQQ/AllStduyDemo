package Day13.DemoTest.DemoClass;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:10:48
 */
public class DemonullClass {
    public static void main(String[] args) {
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类中的show方法");
            }
        }.show();

      Inter2 i =   new Inter2(){

            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        };
      i.show1();
      i.show2();
    }
}
interface Inter{
    void  show();
        }

        interface Inter2{
    void show1();
    void show2();
        }