package Day18.Demo.Demo01;

import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:11:18
 */
public class TestStudent {
    public static void main(String[] args) {

        TreeSet<StudentSorce> list = new TreeSet<>();

        StudentSorce s1 = new StudentSorce("dahei",90,100,113);
        StudentSorce s2 = new StudentSorce("lihua",112,103,90);
        StudentSorce s3 = new StudentSorce("liumei",111,87,120);
        StudentSorce s4 = new StudentSorce("liumei",111,87,120);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.forEach(c-> System.out.println(c));
    }
}
