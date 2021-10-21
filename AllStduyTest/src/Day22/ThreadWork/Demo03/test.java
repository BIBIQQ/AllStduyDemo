package Day22.ThreadWork.Demo03;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:18:38
 */
/*
* 假如现在有一辆公交车,车上有两个乘务员,
* 一个专门负责让乘客上车,并提示目前车上的人数,
* 另一个乘务员专门负责乘客下车,并提示乘客下车后,
* 目前车上的人数,请使用代码模拟这个场景;
*
* 要求:

1:公交车最多乘坐30位乘客,如果超过30人,则上车的乘务员不再安排乘客上车,会一直等待,直到车上有空位子再安排乘客上车;

2:如果车上乘客数量为0了,则不再乘客下车,直到车上有乘客,再继续安排乘客下车;

3:每次上下车的人数采用随机数的方式表示上车的人数和下车的人数,且上车时,1次最多上当前最大空余座位数,最少是1人,下车时,1次最多下当前车上总乘客数,最少是1人;

* */
public class test {
    public static void main(String[] args) {
        Down down = new Down();
        Up up = new Up();

        down.start();
        up.start();

    }
}
