package Day13.Work.Work02;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:19:27
 */
public class DemoIntface {

    public static void main(String[] args) {

        UpString(new Inter() {
            @Override
            public String getValue(String str) {
               String i =str.toUpperCase();
               return i;
            }
        });
    }


        public static void UpString(Inter inter){
            /*String result = inter.getValue("AAAAbbcc").toUpperCase();
            String result1 = inter.getValue(result).substring(1,7);
            System.out.println(result);
//            System.out.println(result1);
                return result1;*/
            String result = inter.getValue("AAAAbbcc").substring(1,7);
            System.out.println(result);

    }


}
@FunctionalInterface
interface Inter{
    public String getValue(String str);
}

