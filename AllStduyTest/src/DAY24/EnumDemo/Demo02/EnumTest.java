package DAY24.EnumDemo.Demo02;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:10:55
 */
public class EnumTest {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("张三");
        p.setAge("13");
        p.setSex(Sexs.女);
        p.setMonth(Month.JULY);
        p.setDay(MonthDay.三);
        System.out.println(p);
    }
}
