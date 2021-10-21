package Day10.pack.edu.info.manager.service;

import Day10.pack.edu.info.manager.dao.TeacherDao;
import Day10.pack.edu.info.manager.domain.Teacher;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:19:24
 */
public class TeacherServic {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher teach) {
        return teacherDao.addTeacher(teach);
    }

    public boolean isExists(String id) {
        // 获取所有的老师信息
        Teacher[] tea = teacherDao.findAllTeaher();
        boolean falg = false;
        for (int i = 0; i < tea.length; i++) {
            Teacher teach = tea[i];
            if (teach != null && teach.getTid().equals(id)) {
                falg = true;
                break;
            }
        }
        return falg;
    }

    public Teacher[] findAllTeacher() {
        Teacher[] tea = teacherDao.findAllTeaher();
        boolean flag = false;
        for (int i = 0; i < tea.length; i++) {
            Teacher teach = tea[i];
            if (teach != null) {
                flag = true;
                break;

            }
        }
        if (flag) {
            return tea;
        } else {
            return null;
        }


    }

    public void deleteTeachByld(String id) {
        teacherDao.deleteTeachByld(id);
    }

    public void updateTeacher(String id, Teacher teacher) {
        teacherDao.updateTeacher(id,teacher);
    }
}
