package Day22.ThreadWork.Demo01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:18:45
 */
public class Num {
    //初始值
  public static int number =1;
  //标记奇数
    public static boolean flag = true;
    //上锁
    public static Object obj = new Object();

}
