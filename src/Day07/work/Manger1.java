package Day07.work;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:19:19
 */
//定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
public class Manger1 {
    private String name;
    private int id;
    private double salary;
    private int bonus;

    public Manger1() {
    }

    public Manger1(String name, int id, double salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("工号为" + id + "基本工资为" +
                salary + "奖金为" + bonus + "的项目经理正在努力的做着管" +
                "理工作,分配任务,检查员工提交上来的代码");
    }


}
