package Day16.Work;

import Day16.Pack.Menu;

import java.util.LinkedList;

/**
 * @author FF
 * @date 2021/9/24
 * @TIME:9:54
 */
public class Waiter {

Cooker cooker = new Cooker();
    public void recording(LinkedList list,String dish) {
        Menu menu = new Menu(dish);
        list.add(menu);
        cooker.Take(list);

    }
    public void show(LinkedList list){
      LinkedList newlist =  cooker.Take(list );
      newlist.forEach(c -> System.out.println(c));
    }
}
