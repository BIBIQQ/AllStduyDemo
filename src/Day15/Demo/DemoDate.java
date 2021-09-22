package Day15.Demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:10:11
 */
public class DemoDate {
    public static void main(String[] args) throws ParseException {
        //输出默认时间
        Date date1 = new Date();
        System.out.println(date1);

        //输出指定时间 ,
        Date date2 = new Date(0L);
        System.out.println(date2);
        // 获取date对象的毫秒值--当前时间的毫秒值
        long time = date1.getTime();
        System.out.println(time);
        // 设置从原点时间过了多少毫秒值
       date1.setTime(20000000000L);
        System.out.println(date1);

        // SimpleDateFormat设置时间格式
        // Date -> String  格式化
        Date  date3 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
       String result1 = sdf.format(date3);
        System.out.println(result1);

       // String -> Date  解析
        String str = "2021-9-22";
        SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy-MM-dd");
        Date result2 = sdf02.parse(str);
        System.out.println(result2);
    }
}
