package com.ff.pojo;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:20:18
 */
public class Stu {
    private Integer id;
    private  String stuName;
    private String  stuAge;
    private String stuScore;

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuAge='" + stuAge + '\'' +
                ", stuScore='" + stuScore + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuScore() {
        return stuScore;
    }

    public void setStuScore(String stuScore) {
        this.stuScore = stuScore;
    }

    public Stu() {
    }

    public Stu(Integer id, String stuName, String stuAge, String stuScore) {
        this.id = id;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuScore = stuScore;
    }
}
