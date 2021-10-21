package Day22.ThreadWork.Demo02;

/**
 * @author FF
 * @date 2021/10/8
 * @TIME:18:38
 */
/*
 * 假如某班级有10人,早晨老师来到教室之后,
 * 需要等待10位学生都到齐了才会开始上课,
 * 如果10位学生还没有到齐,老师需要一直等待;
 * 假如把老师和每一个学生都看成是一个独立的线程,
 * 请使用代码模拟这个老师上课的场景;
 * */
public class test {
    public static void main(String[] args) throws InterruptedException {


            //学生线程
            for (int i = 1; i < 11; i++) {
                StuThread stu = new StuThread();
                stu.setName("学生" + i);
                stu.start();
            }

            //教师线程
            TeachThread t2 = new TeachThread();
            t2.setName("张老师");
            t2.start();


    }
}
