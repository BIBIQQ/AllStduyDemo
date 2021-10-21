package Day17.Demo.Demo07;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:16:06
 */
public class News_sort {
    public static void main(String[] args) {
        TreeSet<News> list = new TreeSet<>(new Comparator<News>() {
            @Override
            public int compare(News o1, News o2) {
                int result = o2.getHeat() - o1.getHeat();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        News n1 = new News("孟晚舟获释", 495);
        News n2 = new News("孟晚舟不认罪", 485);
        News n3 = new News("孟晚舟回国", 470);
        News n4 = new News("华为缺席", 467);
        News n5 = new News("怒批日寇", 485);

        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        int num= 0;
        for (News news : list) {
            num++;
            System.out.print(num+".");
            System.out.println(news);
        }
        System.out.println("-----------");

        list.forEach(new Consumer<News>() {
            int num = 0;
            @Override
            public void accept(News news) {
                num++;
                System.out.print(num+". ");
                System.out.println( news );
            }
        });
    }
}
