package Day11.Test.test01;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:19:13
 */
//工资为8000元的30岁的王小平老师,会吃饭(吃工作餐)和讲课.
public class teacher extends  Humen{
    private String pay;
    private String age;
    private String name;
    private String teach;

    public teacher() {
    }

    public teacher(String eat) {
        super(eat);
    }

    public teacher(String pay, String age, String name, String teach) {
        this.pay = pay;
        this.age = age;
        this.name = name;
        this.teach = teach;
    }

    public teacher(String eat, String pay, String age, String name, String teach) {
        super(eat);
        this.pay = pay;
        this.age = age;
        this.name = name;
        this.teach = teach;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }
}
