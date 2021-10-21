package Day21.review.test01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:21:14
 */
/*
* 已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。

将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。

* */
public class test {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        HashSet<String> hashSet = new HashSet<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (String str : strs) {
            hashSet.add(str);
        }
        for (String s : hashSet) {
            linkedList.add(s);
        }
        for (String s : linkedList) {
            System.out.print(s+"  ");
        }
        System.out.println( );
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"  ");
        }
    }
}
