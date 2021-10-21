package Day11.Test.test01;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:19:10 //
 *//*工资为8000元的30岁的王小平老师,会吃饭(吃工作餐)和讲课.
//成绩为90分的15岁的李小乐学生,会吃饭(吃学生餐)和学习.
//提示: 把老师和学生的共性抽取人类中,人类不使用抽象类*/
public class test01 {
    public static void main(String[] args) {
        teacher tea = new teacher();
        tea.setAge("30");
        tea.setPay("8000");
        tea.setName("王小平");
        tea.setTeach("讲课");
        tea.setEat("吃工作餐");
        System.out.println("工资为" + tea.getPay() + "元的" + tea.getAge() + "岁的" + tea.getName() + "老师,会" + tea.getEat() + "和"+tea.getTeach());

        Student stu = new Student();
        stu.setAge("15");
        stu.setScore("90");
        stu.setName("李小乐");
        stu.setStudy("学习");
        stu.setEat("吃工作餐");
        System.out.println("成绩为"+stu.getScore()+"分的"+stu.getAge()+"岁的"+stu.getAge()+"学生,会"+stu.getEat()+"和"+stu.getStudy());

    }
}
