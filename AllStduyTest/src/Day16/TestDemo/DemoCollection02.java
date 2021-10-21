package Day16.TestDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:10:07
 */
public class DemoCollection02 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("eeeee");
        //创建Iterator 对象
        Iterator<String> it = collection.iterator();
        //创建循环遍历
        while (it.hasNext()){  // 判断索引位置是否有元素
            System.out.println(it.next());  // 取出索引位置的元素；并且往后推一下元素
        }
        }
    }

