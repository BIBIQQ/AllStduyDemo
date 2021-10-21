package Day10.pack.edu.info.Manger2.Dao;

import Day10.pack.edu.info.Manger2.Xinxi.NewStudent;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:14:35
 */
public class StuDao {

private  NewStudent[] student = new NewStudent[5];

public  boolean addStudent(NewStudent newStudent){
// 判断是不是装满了
    int index = -1;
    for (int i = 0; i < student.length; i++) {
        NewStudent stu = student[i];
        if(stu == null){
            index = i;
            break;
        }
    }
    if (index == -1){
        return  false;
    }else{
        student[index] = newStudent;
        return true;
    }

}


    public NewStudent[] findAllStudent() {
        return student;
    }
// 删除学生
    public void removeStudent(String id) {
        // 获取id的索引号
        int index =getIndex(id);
        student[index] = null;
}
//查找索引位置
public int getIndex(String id){
    int index = -1;
    for (int i = 0; i < student.length; i++) {
        NewStudent stu = student[i];
        if(stu != null && stu.getSid().equals(id)){
            index =i;
            break;

        }    }
        return index;
}

    public void setStudent(String id, NewStudent newStudent) {
    int index = getIndex(id);
 student[index] = newStudent;
    }
}
