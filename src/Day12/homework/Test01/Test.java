package Day12.homework.Test01;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:18:53
 */
public class Test {
    public static void main(String[] args) {

        Star a = new star_01();
        a.name="张飞";
        a.age = "18";
        star_01 b = (star_01)a;
        b.dance();
    }
}
