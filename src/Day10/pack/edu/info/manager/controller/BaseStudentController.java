package Day10.pack.edu.info.manager.controller;

import Day10.pack.edu.info.manager.domain.Student;
import Day10.pack.edu.info.manager.service.StudentServic;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:30
 */
public class BaseStudentController {
   private StudentServic studentServic = new StudentServic();
    private  Scanner sc = new Scanner(System.in);
    public void start() {
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            // 主界面
            System.out.println("----------------欢迎来到<学生>信息管理系统----------------");
            System.out.println("请输入您的选择：1.添加学生; 2.删除学生; 3.修改学生；4.查看学生；5.退出");
            String Choice = sc.next();
            switch (Choice) {
                case "1":
                   addStudent();
//                    System.out.println("添加");
                    break;
                case "2":
                    removeStudent();
//                    System.out.println("删除");
                    break;
                case "3":
                    updateSudent();
                    System.out.println("修改");
                    break;
                case "4":
                    findAllStudent();
//                    System.out.println("查看");
                    break;
                case "5":
                    System.out.println("退出");
                    break lo;
            }
        }


    }



    // 增加学生
    public void addStudent() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id  = sc.next();

        while (true) {
            boolean flag = studentServic.isExists(id);
            if (flag) {
                System.out.println("被占用");
                return;
            } else {
                break;
            }
        }
        Student stu = inputStudentInfo(id);

        boolean result = studentServic.addStudent(stu);
        if (result == true) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");

        }
    }

    // 查看学生
    public  void findAllStudent(){
        Student[] stus = studentServic.findAllStudent();
        //判断数组内地址 是否为null
        if(stus == null ){
            System.out.println("查无信息");
        return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null ){
                System.out.println(stu.getSid()+"\t\t"+
                        stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getBirthday());
            }
        }
    }

    //删除学生
    public void removeStudent(){
        String id = inputStudentId();
        studentServic.DelStendent(id);
        System.out.println("删除成功 ");
    }

    //修改学生
    private void updateSudent() {
        Student[] stus = studentServic.findAllStudent();
        //判断数组内地址 是否为null
        if(stus == null ){
            System.out.println("查无信息");
            return;
        }

        String updateId = inputStudentId();

        Student newstu = inputStudentInfo(updateId);

        studentServic.updateStudent(updateId,newstu);
    }

    //输入学生id
    public String inputStudentId(){
        String id;
        lo:
        while(true){
            System.out.println("输入需要的id");
            id = sc.next();
            // 判断是否存在
            boolean falg =  studentServic.isExists(id);
            if(!falg){
                System.out.println("不存在");

            }else{
                break;
            }
        }
        return id;
    }

    // 封装学生对象   抽象方法
    public  Student inputStudentInfo(String id){
        return null;
    }
}


