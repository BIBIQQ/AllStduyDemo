package Day17.BaiduSeach;

import java.util.*;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:20:09
 */
public class Looking {
    public static void main(String[] args) {
        //所有新闻
        News n1 = new News("备孕者可以接种新冠疫苗", 480);
        News n2 = new News("土耳其召见中国大使 中方回应", 460);
        News n3 = new News("日本大阪将取消奥运会火炬传递活动", 447);
        News n4 = new News("杀人犯纸面服刑15年 84人担责", 431);
        News n5 = new News("李四吃饭", 416);
        News n6 = new News("李五喝水", 402);
        News n7 = new News("老二唠嗑", 388);
        News n8 = new News("老舅唠嗑", 470);
        News n9 = new News("小三打架", 451);
        News n10 = new News("夫妻骂街", 402);
        News n11 = new News("杭州亚运", 477);
        News n12 = new News("喜中壹号院", 391);
        News n13 = new News("喜中奥体", 444);
        News n14 = new News("火车和汽车的赛跑", 488);
        News n15 = new News("九妹的口述", 372);


        TreeSet<News> list = new TreeSet<>(new Comparator<News>() {
            @Override
            public int compare(News o1, News o2) {
                return o2.getHeat() - o1.getHeat();
            }
        });
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);
        list.add(n7);
        list.add(n8);
        list.add(n9);
        list.add(n10);
        list.add(n11);
        list.add(n12);
        list.add(n13);
        list.add(n14);
        list.add(n15);

        Scanner sc = new Scanner(System.in);

        System.out.println("=================百度热搜=================");
        //显示所有的新闻
        // 遍历集合
        list.forEach(c -> System.out.println(c));

        while (true) {
            //选择新闻
            System.out.println("选择需要查看的新闻");
            String title = sc.next();
           /* while (it.hasNext()){
                News news = it.next();*/
            for (News news : list)
                if (news.getMessage().contains(title)) {
                    System.out.println("请输入需要的操作：1.点赞，2.评论，3.收藏");
                    int choce = sc.nextInt();
                    switch (choce) {
                        case 1:
                            news.setHeat(news.getHeat() + 3);

                            list.forEach(c -> System.out.println(c));
                            break;
                        case 2:
                            news.setHeat(news.getHeat() + 5);

                            list.forEach(c -> System.out.println(c));
                            break;
                        case 3:
                            news.setHeat(news.getHeat() + 8);

                            list.forEach(c -> System.out.println(c));
                            break;
                        default:
                            System.out.println("输入错误");
                            break;
                    }
                }



            /*for (News news : list) {
                if (news.getMessage().contains(title)) {
                    System.out.println("请输入需要的操作：1.点赞，2.评论，3.收藏");
                    int choce = sc.nextInt();
                    switch (choce) {
                        case 1:
                           int temp = news.getHeat()+ 3;
                           news.setHeat(temp);
                            break;
                        case 2:
                            news.setHeat(news.getHeat() + 5);
                            break;
                        case 3:
                            news.setHeat(news.getHeat() + 8);
                            break;
                        default:
                            System.out.println("输入错误");
                            break;
                    }
                }
            }*/
        }

    }


}
