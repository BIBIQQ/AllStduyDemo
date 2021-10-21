package TestSE_10_10.test02;

import java.util.*;

/**
 * @author FF
 * @date 2021/10/10
 * @TIME:19:44
 */
/*
2.计算地铁票价规则：

       总行程 3站内（包含3站）收费3元，

            3站以上但不超过5站（包含5站）的收费4元，

            5站以上的，在4元的基础上，每多1站增加2元，

            10元封顶；*/
public class test {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        map.put(1, "朱辛庄");
        map.put(2, "育知路");
        map.put(3, "平西府");
        map.put(4, "回龙观东大街");
        map.put(5, "霍营");
        map.put(6, "育新");
        map.put(7, "西小口");
        map.put(8, "永泰庄");
        map.put(9, "林萃桥");
        map.put(10, "森林公园南门");
        map.put(11, "奥林匹克公园");
        map.put(12, "奥体中心");
        map.put(13, "北土城");

        //公交车站牌信息
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> its : set) {
            System.out.print("第" + its.getKey() + "站：");
            System.out.println(its.getValue());
        }

        //咨询信息
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入上车站：");
            String up = sc.next();
            //上车
            if (method01(map, up) > 0) {
                System.out.println("请输入到车站：");
                String end = sc.next();
                //下车
                if (method01(map, end) > 0) {
                    //判断费用
                    int count = method01(map, up) - method01(map, end);
                    count = Math.abs(count);
                    int money = 0;
                    if (count <= 3) {
                        money = 3;
                    } else if (count > 3 && count <= 5) {
                        money = 4;
                    } else if (count > 5) {
                        money = 4 + (count - 5) * 2;
                        money = money > 10 ?  10 : money;
                    }
                    System.out.println("从" + up + "到" + end + "共经过" + count + "站收费" + money + "元，大约需要" + count * 2 + "分钟");
                    break;
                }

            }
            System.out.println("您输入的站台不存在，请重新输入：");
        }


    }

    //    也可以判断站牌
    private static int method01(TreeMap<Integer, String> map, String up) {
        Set<Integer> it = map.keySet();
        int num = -1;
        for (Integer key : it) {
            if (up.equals(map.get(key))) {
                num = key;
            }
        }
        return num;
    }
}