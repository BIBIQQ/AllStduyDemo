package Day10.pack.edu.info.manager.dao;

import Day10.pack.edu.info.manager.domain.Student;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:11:30
 */
public class StudentDao {


  private static Student[] stus = new Student[5];
    static {
    Student stu1 = new Student("001","张三","23","2000-1-1");
    stus[0] = stu1;

    }

    //  判断学号是否存在
    public boolean addStudent(Student stu) {


        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                index = i;
                // 如果为null，记录此处索引，结束遍历
                break;
            }
        }
        if (index == -1) {
            // 装满了
            return false;
        } else {
            //没有装满
            stus[index] = stu;
            return true;
        }

    }

    public Student[] findAllStudent() {
        return stus;
    }

    public  void DelStendent(String id){
        int sid = getIndex(id);
        stus[sid] = null;

    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null && stu.getSid().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String id, Student stu) {
        //查找索引
        int index = getIndex(id);
        stus[index] = stu;

    }
}
