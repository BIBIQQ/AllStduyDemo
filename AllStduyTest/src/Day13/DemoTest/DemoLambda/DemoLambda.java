package Day13.DemoTest.DemoLambda;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:14:52
 */
public class DemoLambda {
    public static void main(String[] args) {
        GoSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去洗澡");
            }
        });
        // Lambda表达式
        GoSwimming(()->{ System.out.println("去洗澡");});
    }

    public static void GoSwimming(Swimming swimming){
        swimming.swim();
    }
}
interface Swimming{
    void swim();
}

