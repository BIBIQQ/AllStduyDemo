package Day12.homework.Test01;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:18:49
 */
public class star_01 extends Star{
    @Override
    public void show() {
        System.out.println("我是明星子类，我的名字是"+name+",我今年"+age+"岁了");
    }

    public void dance(){
        System.out.println("我是明星的子类，我跳拉丁舞");
    }
}
