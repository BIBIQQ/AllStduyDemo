package Demo.Message;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:14:35
 */
//（1）记录管理人员信息。员工信息包括工号、姓名、性别和一个手机号，工号唯一标识每位员工。
public class Manager {
    private String id;
    private String name;
    private String sex;
    private String call;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manager manager = (Manager) o;

        if (id != null ? !id.equals(manager.id) : manager.id != null) return false;
        if (name != null ? !name.equals(manager.name) : manager.name != null) return false;
        if (sex != null ? !sex.equals(manager.sex) : manager.sex != null) return false;
        return call != null ? call.equals(manager.call) : manager.call == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (call != null ? call.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", call='" + call + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public Manager() {
    }

    public Manager(String id, String name, String sex, String call) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.call = call;
    }
}
