package Day10.pack.edu.info.Manger2.Waiter;

import Day10.pack.edu.info.Manger2.Dao.StuDao;
import Day10.pack.edu.info.Manger2.Xinxi.NewStudent;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:15:07
 */
public class StuWaiter {
    private StuDao stuDao = new StuDao();

    public boolean addStudent(NewStudent newStudent) {
        return stuDao.addStudent(newStudent);
    }

    public boolean isExists(String id) {
        NewStudent[] stu = stuDao.findAllStudent();
        boolean exists = false;
        for (int i = 0; i < stu.length; i++) {
            NewStudent stu1 = stu[i];
            if (stu1 != null && stu1.getSid().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
//查看学生
    public NewStudent[] findAllStudent() {
     NewStudent[] newStu =   stuDao.findAllStudent();
     boolean flag = false;
     for (int i = 0; i < newStu.length; i++) {
            NewStudent stu = newStu[i];
            if(stu != null){
                flag = true;
                break;
            }
        }
        if(flag){
            return newStu;
        }else{
            return null;
        }

    }
//删除学生
    public void removerStudent(String id) {
        stuDao.removeStudent(id);

    }

//设置学生
    public void setStudent(String id, NewStudent newStudent) {
    stuDao.setStudent(id,newStudent);
    }
}
