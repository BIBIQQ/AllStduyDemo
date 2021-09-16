package Day10.pack.edu.info.manager.entry;

import Day10.pack.edu.info.manager.controller.OtherStudentController;
import Day10.pack.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:30
 */
public class InfoMangerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            // 主界面
            System.out.println("----------------欢迎来到黑马信息管理系统----------------");
            System.out.println("请输入您的选择：1.学生管理; 2.老师管理; 3.退出 ");
            String choice = sc.next();
            switch (choice){
                case "1":
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                   // System.out.println("学生管理");
                    break;
                case "2":
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
//                    System.out.println("老师管理");
                    break;
                case "3":
                    System.out.println("感谢使用");
                    //退出当前的虚拟机
                    System.exit(0);
            }
        }
    }
}
