package DAY24.Log4jDemo.Demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:17:13
 */
public class Log4jTest {

    //获取日志对象
    private  static  final Logger log = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        try {
            int next = Integer.parseInt(num);
            log.info("正常");
        } catch (NumberFormatException e) {
           log.error("错误");

        }


    }
}
