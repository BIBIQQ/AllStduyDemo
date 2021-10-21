package Day21.Work.work03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:18:43
 */
/*
* 1:学生姓名都提前写在文件中;

2:每次敲回车,随机显示一个学生姓名,每人最多显示一次,所有人都显示完了就结束程序;

3:输入over结束程序;

* */
public class test {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        //数组存
        ArrayList<String> list = new ArrayList<>();
        //存已经随机过的数字
        ArrayList<Integer> newlist = new ArrayList<>();
        //字符缓冲流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\Day21\\Work\\work03\\name.txt"));

        String name;
        while ((name = bufferedReader.readLine()) != null) {
            list.add(name);
        }
        int count = 0;
        lo:
        while (true) {
            int num = random.nextInt(list.size());
            //判断是否存在
            if (!newlist(num, newlist)) {
                System.out.println("今日第" + ++count + "位幸运学生是：" + list.get(num));
                System.out.println("回车查看下一位同学，输入over结束程序");
                String choce = sc.nextLine();
                switch (choce) {
                    case "over":
                        System.out.println("结束");
                        break lo;
                    case "":
                        //查看学生
                        break;
                    default:
                        System.out.println("输入错误");
                        break;
                }
                //所有随机完结束
            } else if (list.size() == newlist.size()) {
                System.out.println("所有学生已经随机完毕");
                break;
            }

        }


        bufferedReader.close();
    }

    //判断是否随机过
    private static boolean newlist(int num, ArrayList<Integer> newlist) {
        for (Integer integer : newlist) {
            if (integer == num) {
                return true;
            }
        }
        newlist.add(num);
        return false;
    }


}
