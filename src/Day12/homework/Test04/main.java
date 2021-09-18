package Day12.homework.Test04;

import Day12.homework.Test04.Manage;
import Day12.homework.Test03.Compere;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:20:57
 */
public class main {
    public static void main(String[] args) {
       Manage m = new Manage(4000,"李四");

        ItMan c = new ItMan(9000,"王五");
        Company company = new Company();

        company.paySalary(m);
        company.paySalary(c);


    }
}
