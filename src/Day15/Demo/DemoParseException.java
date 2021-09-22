package Day15.Demo;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:15:46
 */
public class DemoParseException {
    public static void main(String[] args) {
        int[] arr = null;
        try{
            printArr(arr);
        }catch (NullPointerException e){
            System.out.println("不能为Null");
        }
        System.out.println("大牛皮");
    }
    private static void printArr(int[] arr) {
        if(arr == null){
            throw new NullPointerException();//当参数为null的时候，手动创建一个异常对象，抛给调用者，产生了一个异常
        }else{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
