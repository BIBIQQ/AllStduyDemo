package Day22.Damo.Demo15;

import Day22.ThreadWork.Demo01.Even;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:16:44
 */
//使用原子性，实现两个线程分别打印奇数和偶数
public class test {
    public static void main(String[] args) {

        even even = new even();
        odd odd = new odd();

        even.start();
        odd.start();
    }
}
