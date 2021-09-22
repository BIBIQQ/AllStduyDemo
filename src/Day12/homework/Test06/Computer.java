package Day12.homework.Test06;

/**
 * @author FF
 * @date 2021/9/19
 * @TIME:10:11
 */
public class Computer  extends EGOODs implements PlayGame{
    @Override
    void Open() {
        System.out.println("电脑电源键开机");
    }

    @Override
    void Close() {
        System.out.println("电脑电源键关机");
    }



    @Override
    public void play() {
        System.out.println("玩电脑游戏");
    }
}
