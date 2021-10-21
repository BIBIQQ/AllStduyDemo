package Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:19:18
 */
public class DemoTram {
    public static void main(String[] args) {
        //随机三个距离
        Random random = new Random();
        int r1 = random.nextInt(2001);
        int r2 = random.nextInt(2001);
        int r3 = random.nextInt(2001);

        // 生成三个对象
        Tram c1 = new Tram("爱玛",1099,r1);
        Tram c2 = new Tram("绿能",2099,r2);
        Tram c3 = new Tram("小牛",3099,r3);

        // 插入集合
        ArrayList<Tram> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
int count=0;
        // 筛选距离小于1000以下的车辆
        for (int i = 0; i < list.size(); i++) {

            Tram car = list.get(i);
            int space = car.getSpace();
            if(space <=1000){
                System.out.println(car);
                count++;
            }
        }
        if(count == 0){
            System.out.println("无电车");
        }
    }
}
