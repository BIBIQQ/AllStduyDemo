package Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:18:58
 */
public class DemoSinger {
    public static void main(String[] args) {
        Singer s1 = new Singer("刘德华",25,"打篮球");
        Singer s2 = new Singer("张学友",35,"游泳");
        Singer s3 = new Singer("郭富城",19,"提主球");
        Singer s4 = new Singer("黎明",18,"击剑");
        ArrayList<Singer> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
//        System.out.println(list);
        //遍历数组
        for (int i = 0; i < list.size(); i++) {
        Singer singer = list.get(i);
        int age = singer.getAge();
            if(age > 30){
               /* Singer sing = new Singer(singer.getName(),singer.getAge(),"打保龄球");
                // 修改爱好
                list.set(i,sing);*/

                singer.setLike("baolqiu");
            }else if(age < 20){
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Singer singer = list.get(i);
            System.out.println(singer.getName()+singer.getAge()+ singer.getLike());
        }
    }
}
