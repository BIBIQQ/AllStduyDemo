package Day17.work;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:19:02
 */
/*键盘输入3本书按照价格从低到高排序后输出,如果价格相同则按照书名的自然顺序排序;*/
public class test03 {
    public static void main(String[] args) {
        TreeSet<BookMessage> list = new TreeSet<>(new Comparator<BookMessage>() {
            @Override
            public int compare(BookMessage o1, BookMessage o2) {
                int result = o1.getPrice() - o2.getPrice();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            //输入书名
            System.out.println("请输入第" + count + "本数的名称");
            String newname = sc.next();
            System.out.println("请输入第" + count + "本数的价格（整数）");
            int newprice = sc.nextInt();
            // 存入书本对象
            BookMessage newbook = new BookMessage(newname, newprice);
            //存入书本集合
            list.add(newbook);
            // 输入你的选择
            System.out.println("添加" + newname + "书成功，继续添加请输入1，输入其他数字将结束！");
            int choce = sc.nextInt();
            if (choce == 1) {
                count++;
                continue;
            } else {
                //输出全部书籍总数，以及遍历出来
                System.out.println("您一共添加了：" + count + "本书，分别是");
                list.forEach(c -> System.out.println(c));
                break;
            }
        }
    }
}

