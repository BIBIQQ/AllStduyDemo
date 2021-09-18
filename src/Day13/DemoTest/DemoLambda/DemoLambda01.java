package Day13.DemoTest.DemoLambda;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:15:42
 */
public class DemoLambda01 {
    public static void main(String[] args) {
        useString(new String01() {
            @Override
            public void printMessag(String mes) {
                System.out.println("你" + mes);
            }
        });

        useString(mes ->
                System.out.println("我" + mes)
        );
    }

    public static void useString(String01 string01) {
        string01.printMessag("抠666");
    }
}

interface String01 {
    void printMessag(String mes);
}
