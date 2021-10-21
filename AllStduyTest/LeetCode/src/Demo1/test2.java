package Demo1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author FF
 * @date 2021/10/9
 * @TIME:17:45
 */

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。
//      Linkedlist
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头

public class test2 {
    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList();
        List<Integer> l2 = new LinkedList();
        List<Integer> l3 = new LinkedList<>();

        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(1);

        l2.add(9);
        l2.add(8);
        l2.add(8);
        l2.add(8);
        l2.add(8);

        System.out.println(l1);
        System.out.println(l2);

        for (int i = 0, j = 0; i < l1.size() && j < l2.size(); i++, j++) {
            int num = l1.get(i) + l2.get(j);
            if (num > 10) {

            }
        }

        System.out.println(l3);
    }
}
