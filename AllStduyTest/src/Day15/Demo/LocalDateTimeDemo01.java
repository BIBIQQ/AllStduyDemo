package Day15.Demo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:11:23
 */
public class LocalDateTimeDemo01 {
    public static void main(String[] args) {
        //设置时间
        LocalDateTime localDateTime = LocalDateTime.of(2020,12,22,5,2,2);
        //获得年
        int year = localDateTime.getYear();
        System.out.println(year);
        //获取月份
        int monthValue = localDateTime.getMonthValue();
        System.out.println(monthValue);
        //获取月份中的第几天
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println(dayOfMonth);
        //获取一年中的第几天
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println(dayOfYear);
        //获取星期
        DayOfWeek dayOfWeek =localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);
        //获取分钟
        int minute = localDateTime.getMinute();
        System.out.println(minute);
        //获取小时
        int hour = localDateTime.getHour();
        System.out.println(hour);
    }
}
