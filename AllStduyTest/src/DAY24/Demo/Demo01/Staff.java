package DAY24.Demo.Demo01;

/**
 * @author FF
 * @date 2021/10/13
 * @TIME:9:43
 */
public   class Staff {
    private String name;

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff() {
    }

    public Staff(String name) {
        this.name = name;
    }
}
