package Day18.Demo.Demo01;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:11:12
 */
public class StudentSorce implements  Comparable<StudentSorce>{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public StudentSorce(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        English = english;
    }

    public StudentSorce() {
    }

    private String name;
    private int chinese;
    private int math;
    private int English;

    public int getSum(){
        return chinese+math+English;
    }

    @Override
    public String toString() {
        return " " +
                "姓名：'" + name + '\'' +
                ", 语文：" + chinese +
                ", 数学：" + math +
                ", 英语" + English +"总分："+
                getSum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentSorce that = (StudentSorce) o;

        if (chinese != that.chinese) return false;
        if (math != that.math) return false;
        if (English != that.English) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + chinese;
        result = 31 * result + math;
        result = 31 * result + English;
        return result;
    }

    @Override
    public int compareTo(StudentSorce o) {
//        主要条件
        int result = o.getSum() - this.getSum();
//        次要条件
//        对比语文
        result = result == 0 ? o.chinese - this.chinese:result;

//        对比数学
        result = result == 0 ? o.math - this.math:result;
//        名字
        result = result == 0 ? o.getName().compareTo(this.getName()):result;
        return result;
    }
}
