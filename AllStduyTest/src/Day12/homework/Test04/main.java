package Day12.homework.Test04;

/**
 * @author FF
 * @date 2021/9/17
 * @TIME:20:57
 */
public class main {
    public static void main(String[] args) {
       Manage m = new Manage(4000,"ζε");

        ItMan c = new ItMan(9000,"ηδΊ");
        Company company = new Company();

        company.paySalary(m);
        company.paySalary(c);


    }
}
