package Day16.Pack;

/**
 * @author FF
 * @date 2021/9/23
 * @TIME:19:52
 */
public class TestStudent {
    private int id;
    private String name;

    public TestStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestStudent() {
    }

    @Override
    public String toString() {
        return "TestStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
