package Day19.Demo.Demo04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/27
 * @TIME:15:18
 */
public class test {
    /**
     * 底标跳转功能
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("小米");
        list.add("红米");
        list.add("糯米");
        list.add("大米");
        list.add("黑米");
        list.add("紫米");
        list.add("薏米");
        list.add("玉米");
        list.add("谷米");

        int count = 1;
        //判断总页码是整数
        int allcount = list.size() % 2 == 0 ? list.size() / 2 : (list.size() + 1) / 2;
        System.out.println("--------首页--------");
        //展示首页，选择跳转的页数
        list.stream().limit(2).forEach(c -> System.out.print(c + "   "));
        System.out.println();
        System.out.println("位于第" + count + "页，共" + allcount + "页，需要跳转到哪一页");
        //输入页码
        Scanner sc = new Scanner(System.in);
        //判断输入的页码在可跳转范围，大于的跳转最后一页，过小的跳转第一页
        while (true) {
            int num = sc.nextInt();
            if (num > allcount) {
                num = allcount;
            } else if (num < 1) {
                num = 1;
            }
            //输出对应页码的内容
            list.stream().skip(2 * (num - 1)).limit(2).forEach(c -> System.out.print(c + "  "));
            System.out.println();
            System.out.println("位于第" + num + "页，共" + allcount + "页，需要跳转到哪一页");
        }
    }
}
