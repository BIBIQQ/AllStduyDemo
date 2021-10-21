package Day07.work;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:18:52
 */
public class DemoPhoneBuy {
    public static void main(String[] args) {
        PhoneTest phone1 = new PhoneTest();

        phone1.setBrand("小米");
        phone1.setColor("黑色");
        phone1.setPrice(3998);

        phone1.call();
        phone1.sendMessag();

    }


}
