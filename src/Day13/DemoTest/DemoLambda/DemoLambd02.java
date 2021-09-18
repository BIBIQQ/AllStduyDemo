package Day13.DemoTest.DemoLambda;

import java.util.Random;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:15:55
 */
public class DemoLambd02 {
    public static void main(String[] args) {
        Random r = new Random();
        useRandomNumHandler(new RandomNumHandler() {

            @Override
            public int getNumber() {

                int num = r.nextInt(10) + 1;
                return num;
                // 如果操作的接口中的方法有返回值。，一定要通过return语句，将结果返回
                //否则会编译错误
            }
        });
        useRandomNumHandler(() -> {
//            Random r = new Random();
            int num = r.nextInt(10) + 1;
            return num;
        });
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }

}

interface RandomNumHandler {
    int getNumber();
}