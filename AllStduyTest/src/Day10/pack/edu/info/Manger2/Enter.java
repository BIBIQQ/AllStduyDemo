package Day10.pack.edu.info.Manger2;

import Day10.pack.edu.info.Manger2.Jiemian.StudentPass;
import Day10.pack.edu.info.Manger2.Jiemian.TeacherPass;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:11:20
 */
public class Enter {
    public static void main(String[] args) {
       while (true){
        System.out.println("———————欢迎来到学教管理系统———————");
        System.out.println("请输入你的选择：1.学生系统；2.老师系统；3.退出系统");
        // 输入选择
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        switch (choice) {
            case "1":
                StudentPass studentPass = new StudentPass();
                studentPass.start();
                System.out.println("学生系统");
                break;
            case "2":
                TeacherPass teacherPass = new TeacherPass();
                teacherPass.start();
                System.out.println("老师系统系统");
                break;
            case "3":
                System.out.println("退出系统");
                System.exit(0);
        }
        }
    }
}
