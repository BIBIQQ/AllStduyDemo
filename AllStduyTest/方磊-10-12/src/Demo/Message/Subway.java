package Demo.Message;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:14:35
 */
//地铁站信息包括地铁站编号、地铁站名称、所属路线、停留时间、起始运营时间、停止运营时间,系统内部用地铁站编号唯一标识每个地铁站。
//    地铁站（地铁站编号，地铁站名称，所属路线）
public class Subway {
    private String id;
    private String name;
    private String line;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subway subway = (Subway) o;

        if (id != null ? !id.equals(subway.id) : subway.id != null) return false;
        if (name != null ? !name.equals(subway.name) : subway.name != null) return false;
        return line != null ? line.equals(subway.line) : subway.line == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (line != null ? line.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", line='" + line + '\'' +
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

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Subway() {
    }

    public Subway(String id, String name, String line) {
        this.id = id;
        this.name = name;
        this.line = line;
    }
}
