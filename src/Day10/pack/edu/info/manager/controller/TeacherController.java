package Day10.pack.edu.info.manager.controller;

import Day10.pack.edu.info.manager.dao.TeacherDao;
import Day10.pack.edu.info.manager.domain.Teacher;
import Day10.pack.edu.info.manager.service.TeacherServic;

import java.text.BreakIterator;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:52
 */
public class TeacherController {
    private TeacherServic teacherServic = new TeacherServic();
    Scanner sc = new Scanner(System.in);

    public void start() {
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            // 主界面
            System.out.println("----------------欢迎来到<老师>信息管理系统----------------");
            System.out.println("请输入您的选择：1.添加老师; 2.删除老师; 3.修改老师；4.查看老师；5.退出");
            String Choice = sc.next();
            switch (Choice) {
                case "1":
                    addTeacher();
//                    System.out.println("添加1");
                    break;
                case "2":
                    deleteTeachByld();
//                    System.out.println("删除");
                    break;
                case "3":
                    updateTeacher();
//                    System.out.println("修改");
                    break;
                case "4":
                    findAllTeacher();
//                    System.out.println("查看");
                    break;
                case "5":
                    System.out.println("退出");
                    break lo;
            }
        }
    }

    // 添加老师
    public void addTeacher() {
        // 输入工号
        // 对工号进行检索，避免出现重复的工号
        System.out.println("输入工号");
        String tid = sc.next();
        while (true) {
            boolean falg = teacherServic.isExists(tid);
            if (falg) {
                System.out.println("存在");
                return;
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
// 封装老师对象
        Teacher teacher = new Teacher();
        teacher.setTid(tid);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(bir);

        // 判断是否存在相同的工号，不存在的录入
        boolean result = teacherServic.addTeacher(teacher);
        if (result == true) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    //删除老师
    public void deleteTeachByld() {
//输入工号
        System.out.println("输入需要删除的工号");
        String id = sc.next();
        boolean exsit = teacherServic.isExists(id);
        if (exsit) {
            teacherServic.deleteTeachByld(id);
            System.out.println("删除成功");
        } else {
            System.out.println("输入错误");
        }
    }

    // 修改老师
    public void updateTeacher() {
        System.out.println("输入需要更改的工号");
        Teacher[] tea = teacherServic.findAllTeacher();
        //判断数组内地址 是否为null
        if(tea == null ){
            System.out.println("查无信息");
            return;
        }
        //输入工号
        String id = sc.next();
        boolean flag = teacherServic.isExists(id);
        if(!flag){
            System.out.println("不存在");
            return;
        }
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String bir = sc.next();
// 封装老师对象
        Teacher teacher = new Teacher();
        teacher.setTid(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(bir);

      teacherServic.updateTeacher(id,teacher);
    }

        // 查看老师
        public void findAllTeacher(){
            Teacher[] tea = teacherServic.findAllTeacher();
            if (tea == null) {
                System.out.println("查无信息");
            } else {
                System.out.println("工号\t\t姓名\t\t年龄\t\t生日");
                for (int i = 0; i < tea.length; i++) {
                    Teacher teacher = tea[i];
                    if (teacher != null) {
                        System.out.println(teacher.getTid() + "\t\t" +
                                teacher.getName() + "\t\t" + teacher.getAge() + "\t\t" + teacher.getBirthday());
                    }
                }
            }
        }

        //输入老师id


        // 封装老师对象


    }

