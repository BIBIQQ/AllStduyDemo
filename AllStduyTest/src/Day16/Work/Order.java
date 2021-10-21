package Day16.Work;

import Day16.Pack.Menu;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/24
 * @TIME:9:57
 */
public class Order {

    public static void main(String[] args) {
        LinkedList<Menu> list = new LinkedList<>();
        Waiter waiter = new Waiter();

        System.out.println("请选择你需要的菜");
        Scanner sc = new Scanner(System.in);
        String dish = sc.next();
// 传递给服务员，记录点菜
        waiter.recording(list, dish);
      lo:  while (true) {
            System.out.println("是否还需要点菜");
            String choce = sc.next();
            switch (choce) {
                case "yes":
                    System.out.println("请选择你需要的菜");
                    String newdish = sc.next();
                    waiter.recording(list, newdish);
                    break;
                case "no":
                    //输出点了的所有菜
                    waiter.show(list);
                    break lo;
            }
        }
    }
}

