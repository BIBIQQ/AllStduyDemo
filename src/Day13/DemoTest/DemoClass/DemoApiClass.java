package Day13.DemoTest.DemoClass;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:11:38
 */
public class DemoApiClass {
    public static void main(String[] args) {
        GoSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁，去游泳");
            }
        });
    }

    public static void GoSwimming(Swimming swimming){
        swimming.swim();
    }
}
interface Swimming{
    void swim();
}