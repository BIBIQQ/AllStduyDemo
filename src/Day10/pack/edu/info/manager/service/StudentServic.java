package Day10.pack.edu.info.manager.service;

import Day10.pack.edu.info.manager.dao.StudentDao;
import Day10.pack.edu.info.manager.domain.Student;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:31
 */
public class StudentServic {
//    StudentDao studentDao = new StudentDao();
    private StudentDao studentDao = new StudentDao();

    // 添加学生方法
    //  获取学号Dao是否存在的布尔值，反馈给controller
    public boolean addStudent(Student stu) {
        // 学生对象传递给Dao库管中的addStudent方法
        // 回传boolean类型，传递给控制器
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {

        Student[] stus = studentDao.findAllStudent();
        // 假设不存在
        boolean exists = false;

        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getSid().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public  Student[] findAllStudent(){
        Student[] allStudent = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null){
                flag = true;
                break;
            }
        }
        if(flag){
            return allStudent;
        }else {
            return null;
        }
    }

    public void DelStendent(String id) {
studentDao.DelStendent(id);
    }


    public void updateStudent(String id,Student stu) {
        studentDao.updateStudent(id,stu);
    }
}
