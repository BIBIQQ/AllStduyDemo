package Day08.work;

import Day08.pack.Student;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:20:23
 */
public class DemoSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       String[] a= str.split(",");
       Student b= new Student(a[0],a[1]);
        System.out.println(b.getName()+b.getAge());
    }
}

