package Day12.homework.Test03;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:19:25
 */
public class Girl extends Student implements Compere{
    @Override
    public void eat() {
        System.out.println("我是女同学，我嗑瓜子，吃水果...");
    }

    @Override
    public void compere() {
        System.out.println("女士们，先生们，大家好，我是主持人......");
    }
}
