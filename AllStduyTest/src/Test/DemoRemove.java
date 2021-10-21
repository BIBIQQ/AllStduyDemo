package Test;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:11:32
 */
public class DemoRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("111");
        list.add("111");
        list.add("111");
        list.add("22");
        list.add("22");
        list.add("33");

        // while (list.remove("111"));

        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            if("111".equals(a)){
                list.remove(a);
                i--;
            }
        }
        System.out.println(list);

    }
}
