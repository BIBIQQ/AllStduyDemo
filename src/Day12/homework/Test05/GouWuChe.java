package Day12.homework.Test05;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/18
 * @TIME:20:53
 */
public class GouWuChe {
    ArrayList<Goods> arrayList = new ArrayList<>();
    {
        System.out.println("==========添加商品============");
    }
    // 增加商品
    public void addGoods(Goods goods) {

        arrayList.add(goods);
        System.out.println("加入 "+goods.getName()+"成功");
    }

    // 打印商品
    public void showGoods() {
        int index = -1;
        System.out.println("===========打印商品=========");
        System.out.println("您选购的商品为：");
        for (int i = 0; i < arrayList.size(); i++) {
            Goods goods = arrayList.get(i);
            index++;
            if (index != -1) {
                System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice());
            } else {
                System.out.println("没有购买商品");
            }
        }

    }

    // 计算价格
    public void total() {
        double sum = 0;
        double allsum = 0;
        double discounts = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Goods goods = arrayList.get(i);
            if (goods.getName().equals("笔记本") || goods.getName().equals("手机")) {
                discounts += goods.getPrice();

            } else {
                sum += goods.getPrice();
            }
        }
        System.out.println("原价为" + (discounts + sum));
        System.out.println("打折后为" + ((discounts * 0.8) + sum));
    }
}
