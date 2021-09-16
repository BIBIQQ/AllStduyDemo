package Day10.pack.edu.info.manager.controller;

import Day10.pack.edu.info.manager.domain.Student;
import Day10.pack.edu.info.manager.service.StudentServic;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:30
 */
public class StudentController extends  BaseStudentController {

    private  Scanner sc = new Scanner(System.in);


    // 封装学生对象
    @Override
    public  Student inputStudentInfo(String id){
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String bir = sc.next();

        Student newstu = new Student();
        newstu.setName(name);
        newstu.setAge(age);
        newstu.setBirthday(bir);
        newstu.setSid(id);

        return newstu;
    }
}


