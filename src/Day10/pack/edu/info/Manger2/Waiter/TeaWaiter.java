package Day10.pack.edu.info.Manger2.Waiter;

import Day10.pack.edu.info.Manger2.Dao.TeaDao;
import Day10.pack.edu.info.Manger2.Xinxi.NewTeacher;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:17:01
 */
public class TeaWaiter {
    private TeaDao teaDao = new TeaDao();
//增加学生
    public boolean addTeacher(NewTeacher newTeacher) {
    return teaDao.addTeacher(newTeacher);

    }
//检索是否重复
    public boolean IdCheck(String id) {
        NewTeacher[] teacher = teaDao.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < teacher.length; i++) {
            NewTeacher tea = teacher[i];
            if(tea != null && tea.getTid().equals(id)){
                flag = true;
                break;
            }
        }
       return flag;
    }
// 查看学生
    public NewTeacher[] findAllTeacher() {
    return teaDao.findAllTeacher();
    }

    // 修改学生
    public void setTeacher(String id, NewTeacher newTeacher) {
    teaDao.setTeacher(id,newTeacher);
    }
// 删除学生
    public void removeTea(String id) {
    teaDao.removeTea(id);
    }
}
