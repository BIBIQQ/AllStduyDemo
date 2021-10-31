package com.itheima.pojo;

/**
 * @author FF
 * @date 2021/10/29
 * @TIME:10:31
 */
public class Brand {
    private String name;
    private  String age;
    private int status;

    public Brand(String name, String age, int status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Brand() {
    }
}
