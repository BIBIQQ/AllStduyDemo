package Day17.Demo.Demo02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:10:26
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("大宝");
        list.add("大宝");
        list.add("大宝");
        list.add("大宝");

        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strings));
    }
}
