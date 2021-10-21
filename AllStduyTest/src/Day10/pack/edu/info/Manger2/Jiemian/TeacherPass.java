package Day10.pack.edu.info.Manger2.Jiemian;

import Day10.pack.edu.info.Manger2.Waiter.TeaWaiter;
import Day10.pack.edu.info.Manger2.Xinxi.NewTeacher;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:11:26
 */
public class TeacherPass {
    private Scanner sc = new Scanner(System.in);
    private TeaWaiter teaWaiter = new TeaWaiter();

    public void start() {
        lo:
        while (true) {
            System.out.println("———————欢迎来到老师系统———————");
            System.out.println("输入你的选择：1.添加；2.删除；3.修改；4.查看所有；5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addTeacher();
                    System.out.println("添加");
                    break;
                case "2":
                    removeTeacher();
                    System.out.println("删除");
                    break;
                case "3":
                    setTeacher();
                    System.out.println("修改");
                    break;
                case "4":
                    findAllTeacher();
                    System.out.println("查看");
                    break;
                case "5":
                    System.out.println("退出");
                    break lo;
            }
        }
    }

    // 增加老师
    public void addTeacher() {
        System.out.println("输入工号");
        String id;
        while (true) {
            id = sc.next();
            boolean flag = teaWaiter.IdCheck(id);
            if (flag) {
                System.out.println("重新输入");
            } else {
                break;
            }
        }
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String bir = sc.next();
//封装老师对象
        NewTeacher newTeacher = new NewTeacher();
        newTeacher.setTid(id);
        newTeacher.setName(name);
        newTeacher.setAge(age);
        newTeacher.setBir(bir);

        boolean flag = teaWaiter.addTeacher(newTeacher);
        if (flag) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    // 查看老师
    public void findAllTeacher() {
        NewTeacher[] teachers = teaWaiter.findAllTeacher();
        if (teachers == null) {
            System.out.println("无信息,请添加");
            return;
        }
        System.out.println("工号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < teachers.length; i++) {
            NewTeacher tea = teachers[i];
            if (tea != null) {
                System.out.println(tea.getTid() + tea.getName() + tea.getAge() + tea.getBir());
            }
        }

    }

    // 删除老师
    public void removeTeacher() {
        System.out.println("输入需要删除的工号");
        String id = sc.next();

        boolean flag = teaWaiter.IdCheck(id);
        if (flag) {
teaWaiter.removeTea(id);
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    // 修改老师
    public void setTeacher() {
        // 输入需要修改的id
        System.out.println("输入你需要修改的id");
        String id = sc.next();

        // 判断输入的id是否存在；存在即修改
        boolean flag = teaWaiter.IdCheck(id);
        if (!flag) {
            System.out.println("不存在重新输入");
            return;
        }

        // 输入封装对象
        System.out.println("输入你的姓名");
        String name = sc.next();
        System.out.println("输入你的年龄");
        String age = sc.next();
        System.out.println("输入你的生日");
        String bir = sc.next();

        NewTeacher newTeacher = new NewTeacher(id, name, age, bir);
        teaWaiter.setTeacher(id, newTeacher);

    }
}