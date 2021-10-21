package Day18.PDD;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:20:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random i = new Random();
        HashMap<String,Integer> team = new HashMap<>();
        Person person = new Person("熊大", 20000, 19900);

        while (true) {

            System.out.println("========================拼多多砍价========================");
            System.out.println(person);
            System.out.println("========================拼多多砍价========================");
            //展示已经砍过的
            team.forEach((k,v)-> System.out.println(k+" ----- "+"砍掉了"+v/100.0+"元"));
            //队友不在群内
            //喊队友
            System.out.println("叫谁来砍！！或者输入退出，退出拼多多");
            String name = sc.next();
            //退出
            if (name.equals("退出")) {
                System.out.println("感谢参与！");
                break;
            }
            int price = i.nextInt(20);
            //砍过的队友，存入一个集合内，判断是都砍过
//        Person old = new Person(name,0,0);
           team.put(name,price);
           boolean result = team.containsKey(name);
            if (team.size() < 40 ) {
                if (result) {
                    System.out.println(name+" 砍价成功，砍了"+price/100.0+"元，再叫兄弟砍，快砍好了");
                    person.setSurplus(person.getSurplus() + price);
                } else {
                    System.out.println("这个大哥砍过了，换一个");
                }
            } else {
                System.out.println("砍价成功："+name+"为砍掉了"+(person.getPrice()-person.getSurplus())/100.0+"元");
                System.out.println("砍价成功，喜提劳斯莱斯五元优惠券");
                break;
            }
        }
    }
}
