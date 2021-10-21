package Day16.Work;

import Day16.Pack.TestStudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:19:48
 */
public class test04_Dao {
    Random num = new Random();
    // 存储随机后的id值，并进行判断
    Collection<Integer> list = new ArrayList<>();

    public ArrayList<TestStudent> AllStudent() {
        //创建学生对象，并存储
        TestStudent stu1 = new TestStudent(001, "李四");
        TestStudent stu2 = new TestStudent(002, "李三");
        TestStudent stu3 = new TestStudent(003, "李一");
        TestStudent stu4 = new TestStudent(004, "李二");
        TestStudent stu5 = new TestStudent(005, "李五");
        TestStudent stu6 = new TestStudent(006, "李六");

        ArrayList<TestStudent> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);

        return list;

    }


// 随机id
    public void RandomStudent() {
        //检测新数组的长度是否和学生对象长度一致，不一致执行，一致结束
        if(list.size() != AllStudent().size()){
            int id = num.nextInt(AllStudent().size());
            boolean result = difference(id);
            if (!result) {
                list.add(id);
                System.out.println(AllStudent().get(id));
            }else {
                RandomStudent();
            }
        }else{
            System.out.println("已经抽完了");
        }

    }
// 判断id 是否在新的数组里面存在
    public boolean difference(int id) {
        for (Integer integer : list) {
            Integer newid = id;
            if (integer == newid) {
                return true;
            }
        }
        return false;
    }
}
