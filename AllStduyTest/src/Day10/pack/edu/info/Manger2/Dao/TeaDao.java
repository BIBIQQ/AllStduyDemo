package Day10.pack.edu.info.Manger2.Dao;

import Day10.pack.edu.info.Manger2.Xinxi.NewTeacher;

/**
 * @author FF
 * @date 2021/9/14
 * @TIME:17:01
 */
public class TeaDao {
    private  static  NewTeacher[] teachers = new NewTeacher[5];
    static {
        NewTeacher tea1 = new NewTeacher("1","2","3","4");
        NewTeacher tea2 = new NewTeacher("1","2","3","4");
    teachers[0]=tea1;
    teachers[1]=tea2;
    }

//增加学生
    public boolean addTeacher(NewTeacher newTeacher) {
   int  index = -1;
        for (int i = 0; i < teachers.length; i++) {
          NewTeacher teacher  =  teachers[i];
          if(teacher == null){
              index = i;
              break;
          }
        }
    if (index == -1){
        return false;
    }else{
        teachers[index] = newTeacher;
        return true;
    }

    }

    public NewTeacher[] findAllTeacher() {
    return teachers;
    }

    public void setTeacher(String id, NewTeacher newTeacher) {
    int index = getId(id);
        teachers[index] =newTeacher;
    }

    // 寻找id的索引位置
    public  int getId(String id){
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            NewTeacher teach = teachers[i];
            if(teach != null && teach.getTid().equals(id)){
                index = i ;
                break;

            }        }
            return index;
    }
// 删除学生
    public void removeTea(String id) {
    int index = getId(id);
    teachers[index] = null ;

    }
}
