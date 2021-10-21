package Day12.homework.Test04;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:20:23
 */
public class Company implements Money  {
    int AllMoney = 100000;

    @Override
    public void paySalary(Staff pay) {
AllMoney = AllMoney - pay.getPay();
        System.out.println(pay.getName()+"发"+pay.getPay()+"剩余:"+AllMoney);
    }


}
