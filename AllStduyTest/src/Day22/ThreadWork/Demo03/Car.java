package Day22.ThreadWork.Demo03;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:20:41
 */
public class Car {
    //设置车辆最大乘坐
    public static int num = 30 ;
    //设置车辆剩余位置
    public static int overNum = 0;
    //锁
    public static Object lock = new Object();

}
