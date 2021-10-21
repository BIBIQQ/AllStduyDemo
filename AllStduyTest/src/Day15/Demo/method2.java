package Day15.Demo;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:11:42
 */
public class method2 {
    public static void main(String[] args) throws ParseException {
method1();
method2();
    }
private  static void method2(){
    String s = "2020年11月12日 11:01:10";
    DateTimeFormatter patten = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
    LocalDateTime parse = LocalDateTime.parse(s,patten);
    System.out.println(parse);
}
private  static  void method1(){
        LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    DateTimeFormatter patten = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
    String s = localDateTime.format(patten);
    System.out.println(s);
}

}
