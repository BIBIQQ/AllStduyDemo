import pack.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/10
 * @TIME:14:41
 */
public class StudentIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //创建学生集合
        ArrayList<Student> list = new ArrayList<>();

        lo:
        while (true){
            // 搭建主界面
            System.out.println("---------------------学生管理系统---------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                //System.out.println("删除学生");
                    removeStudent(list);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    setStudent(list);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    showStudent(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

    // 增加学生
    private   static  void addStudent(ArrayList<Student> list){
        ArrayList<Student> newlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid = sc.next();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String birth = sc.next();
        Student s1 = new Student(name,age,sid,birth);
        list.add(s1);
        System.out.println("添加成功");
    }

    // 展示所有学生
    private static void showStudent(ArrayList<Student> list){
        //判断集合里面是否存在数据
        if(list.size()==0){
            System.out.println("无数据，请输入！！！！！！");
        }
        System.out.println("学号      姓名       年龄        生日");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getSid()+"       "+student.getName()+"       "+student.getAge()+"        "+student.getBirth());
        }
    }

    // 搜索学号是否存在
    private  static int getIndex(ArrayList<Student> list,String sid){
        int index= -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(sid.equals(stu.getSid())){
                index = i;
            }
        }
        return index;
    }

    // 删除学生
    private    static void removeStudent(ArrayList<Student> list){
        //输入删除的学号
        System.out.println("请输入需要删除的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int num = getIndex(list,sid);
        if(num == 0){
            list.remove(num);
            System.out.println("删除学生成功");
        }else{
            System.out.println("学号不存在");
        }
    }

    // 修改学生
    private  static  void setStudent(ArrayList<Student> list){
        //输入修改的学号
        System.out.println("请输入需要修改的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int num = getIndex(list,sid);
        if(num == 0){
            System.out.println("选择需要修改的数据");
            System.out.println("1.姓名；2.年龄；3.生日；4.退出");
            String choic = sc.next();
            switch (choic){
                case "1":
                    System.out.println("输入需要修改的姓名");
                   String name = sc.next();
                   Student stu = new Student(name,list.get(num).getAge(),sid,list.get(num).getBirth());
                   list.set(num,stu);
                    System.out.println("修改成功");
                    break;
                case "2":
                    System.out.println("输入需要修改的年龄");
                    String age = sc.next();
                    Student stu1 = new Student(list.get(num).getName(),age,sid,list.get(num).getBirth());
                    list.set(num,stu1);
                    System.out.println("修改成功");
                    break;
                case "3":
                    System.out.println("输入需要修改的生日");
                    String birth = sc.next();
                    Student stu2 = new Student(list.get(num).getName(),list.get(num).getAge(),sid,birth);
                    list.set(num,stu2);
                    System.out.println("修改成功");
                    break;
                case "4":break ;

            }
        }else{
            System.out.println("学号不存在，请重新选择");
        }
    }
}
