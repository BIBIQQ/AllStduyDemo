package Day14.HomWork.Test_AllString;

/**
 * @author FF
 * @date 2021/9/21
 * @TIME:14:24
 */
public class test01 {
    public static void main(String[] args) {

        StringStudent stu = new StringStudent("王哈哈",24,1.82,false,'男');
        String name = String.valueOf(stu.getName());
        String age = String.valueOf(stu.getAge());
        String height = String.valueOf(stu.getHeight());
        String marriy = String.valueOf(stu.isMarriy());
        String sex  = String.valueOf(stu.getSex());
        System.out.println(name+age+height+marriy+sex);
    }
}
