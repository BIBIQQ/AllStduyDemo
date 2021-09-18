package Day13.DemoTest.DemoLambda;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:16:06
 */
public class DemoLambd03 {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b ;
            }
        });


        useCalculator((a, b) ->  a+b );
    }

    public static void useCalculator (Calculator calculator){
        int result = calculator.calc(10,20);
        System.out.println(result);
    }
}
interface Calculator{
    int calc(int a,int b);
}