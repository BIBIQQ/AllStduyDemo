package Day15.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:11:10
 */
public class JDK8DateDemo01 {
    public static void main(String[] args) throws ParseException {
//        getTime();
        String s = "2020年1月1日 00:00:00";
        DateTimeFormatter pattern  = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s,pattern);
        LocalDateTime newlocalDateTime =  localDateTime.plusDays(1);
        String result = newlocalDateTime.format(pattern);
        System.out.println(result);


    }

    private static void getTime() throws ParseException {
        String s = "2020年1月1日 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        long time = date.getTime();
        time =  time + (1000*60*60*24);
        Date newDate = new Date(time);
        String result = sdf.format(newDate);
        System.out.println(result);
    }


}
