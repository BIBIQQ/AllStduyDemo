package Day08;

import Day08.pack.Student;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:15:49
 */
public class DemoSplit {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String[] sArr =user.split(" ");
        Student stu = new Student(sArr[0],sArr[1]);
        System.out.println(stu.getName()+"—"+stu.getAge());
    }
}
