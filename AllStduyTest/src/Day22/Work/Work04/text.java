package Day22.Work.Work04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:19:11
 */

/*
* 拼手速抽奖案例.

1.现有一个集合装了10个奖品在里面,分别是:{"电视机","电冰箱","电脑","游戏机","洗衣机","空调","手机","平板电脑","电动车","电饭煲"};

2.假如有3个人同时去抽这10个奖品.最后打印出来.三个人各自都抽到了什么奖品.

例如:

张三: “电视机”,”电冰箱”,”电脑”,”游戏机”,”洗衣机”

李四: ”空调”,”手机”,”平板电脑”,

王五: ”电动车”,”电饭煲

要求:

1:3个人同时开始抽奖,每次抽奖需要使用0.5秒才能完成抽奖;

2:需要控制住同一个奖项不能同时被多个人抽走;

* */
public class text {
    public static void main(String[] args) {
        ArrayList<String> t1_list = new ArrayList<>();
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.setName("张三");
        Thread t2 = new Thread(mr);
        t2.setName("李四");
        Thread t3 = new Thread(mr);
        t3.setName("王五");

        t1.start();
        t2.start();
        t3.start();

    }
}
