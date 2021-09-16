package Day07.work;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:19:26
 */
public class DemoProjectTest {
    public static void main(String[] args) {
        Manger mr = new Manger("张三",123,15000,6000);
        Coder itman = new Coder();
        itman.setName("王五");
        itman.setId(135);
        itman.setSalary(10000);
        itman.work();
        mr.work();
    }
}
