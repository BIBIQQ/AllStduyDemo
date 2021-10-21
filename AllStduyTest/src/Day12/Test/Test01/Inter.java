package Day12.Test.Test01;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:10:26
 */
public class Inter implements InterA,InterB{
    @Override
    public void study() {
        System.out.println("study方法");
    }


    @Override
    public void print1() {
        System.out.println("输出1");
    }

    @Override
    public void print2() {
        System.out.println("输出2");
    }


}
