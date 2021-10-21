package Test;

import java.util.ArrayList;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:11:44
 */
public class DemoChoose {


    public static void main(String[] args) {
        ArrayList<Computer> list = new ArrayList();
        Computer c1 = new Computer("华为",1999);
        Computer c2 = new Computer("小米",2999);
        Computer c3 = new Computer("联想",3999);
        list.add(c1);
        list.add(c2);
        list.add(c3);

        ArrayList<Computer> newlist = getMax(list);

        for (int j =0;j<newlist.size();j++){
             Computer aa =  newlist.get(j);
            System.out.println(aa.getBonus()+aa.getPrice());
        }
    }

    public  static ArrayList<Computer> getMax(ArrayList<Computer> list){
        ArrayList<Computer> newlist = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            Computer computer = list.get(i);
            if(3000 < computer.getPrice()){
                newlist.add(computer);
            }
        }
        return newlist;
    }
}
