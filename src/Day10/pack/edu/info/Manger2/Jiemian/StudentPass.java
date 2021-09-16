package Day10.pack.edu.info.Manger2.Jiemian;

import Day10.pack.edu.info.Manger2.Waiter.StuWaiter;
import Day10.pack.edu.info.Manger2.Xinxi.NewStudent;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:11:26
 */
public class StudentPass {
    private StuWaiter stuWaiter = new StuWaiter();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        lo:
        while (true) {
            System.out.println("———————欢迎来到学生系统———————");
            System.out.println("输入你的选择：1.添加；2.删除；3.修改；4.查看所有；5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent();
                    System.out.println("添加");
                    break;
                case "2":
                    removeStudent();
                    System.out.println("删除");
                    break;
                case "3":
                    setStudent();
                    System.out.println("修改");
                    break;
                case "4":
                    findAllStudent();
                    System.out.println("查看");
                    break;
                case "5":
                    System.out.println("退出");
                    break lo;
            }
        }
    }



    //增加学生
    public void addStudent() {
        System.out.println("请输入学号");
        String id;
        while (true) {
            id = sc.next();
            boolean flag = stuWaiter.isExists(id);
            if (flag) {
                System.out.println("请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String bir = sc.next();

        NewStudent newStudent = new NewStudent();
        newStudent.setSid(id);
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setBir(bir);
        boolean flag = stuWaiter.addStudent(newStudent);
        if (flag) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    // 查看学生
    public void findAllStudent() {
        NewStudent[] newStudent = stuWaiter.findAllStudent();
        if (newStudent == null) {
            System.out.println("内无信息");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < newStudent.length; i++) {
            NewStudent stu = newStudent[i];
            if (stu != null) {
                System.out.println(stu.getSid() + stu.getName() + stu.getAge() + stu.getBir());
            }
        }
    }

    // 删除学生
    public void removeStudent() {
        System.out.println("输入需要删除的学号");
        String id;
        id = sc.next();
        boolean flag = stuWaiter.isExists(id);
        if (flag) {
            stuWaiter.removerStudent(id);

        }else {
        System.out.println("请重新输入");
    }}

    //设置学生
    public  void setStudent(){
        System.out.println("输入需要修改的学号");
        String id = sc.next();
        boolean flag = stuWaiter.isExists(id);
        if (!flag) {
            System.out.println("请重新输入");
            return;
    }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String bir = sc.next();

        NewStudent newStudent = new NewStudent();
        newStudent.setSid(id);
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setBir(bir);

    stuWaiter.setStudent(id,newStudent);

}}

