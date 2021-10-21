package Day22.Work.Work04;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author FF
 * @date 2021/10/7
 * @TIME:20:47
 */
public class MyRunnable  implements Runnable{
    private Object object = new Object();
   private ArrayList<String> list = getlist();


    @Override
    public void run() {

        while (true) {

            //睡眠0.5s
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同个奖牌只能一个人取走
        synchronized (object){
            if(list.size()==0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"抽到了："+list.get(0));
            //抽到了就去除掉
            list.remove(0);

        }

        }
    }
    public ArrayList<String> getlist(){
        String[] arr = {"电视机","电冰箱","电脑","游戏机","洗衣机","空调","手机","平板电脑","电动车","电饭煲"};
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }
}
