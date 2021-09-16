package Day10.pack.edu.info.manager.dao;

import Day10.pack.edu.info.manager.domain.Teacher;

/**
 * @author FF
 * @date 2021/9/13
 * @TIME:19:21
 */
public class TeacherDao {
    // 新建储存数据的数组   
    Teacher[] teachs = new Teacher[5];

    public boolean addTeacher(Teacher teacher) {
        //先判断学号是否存在
        // 建立一个空值  假设不存在
        int index = -1;
        // 存在就录入，不存在返回不存在的值
        // 遍历存在与否
        for (int i = 0; i < teachs.length; i++) {
            Teacher teach = teachs[i];
            if (teach == null) {
                index = i;  // 不存在数据 ，记录这个索引，进行赋值
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            teachs[index] = teacher;
            return true;
        }
    }

    public Teacher[] findAllTeaher() {
        return teachs;

    }

    public void deleteTeachByld(String id) {
        int index = getIndex(id);
        teachs[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachs.length; i++) {
            Teacher tea = teachs[i];
            if (tea != null && tea.getTid().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateTeacher(String id, Teacher teacher) {
        int index = getIndex(id);
        teachs[index] = teacher;

    }
}