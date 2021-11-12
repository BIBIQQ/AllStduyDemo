package com.ff.pojo;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:19:25
 */
public class BrandLog {
    private Integer id;
    private String time;
    private String ids;
    private Integer result;

    @Override
    public String toString() {
        return "BrandLog{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", ids='" + ids + '\'' +
                ", result=" + result +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public BrandLog() {
    }

    public BrandLog(Integer id, String time, String ids, Integer result) {
        this.id = id;
        this.time = time;
        this.ids = ids;
        this.result = result;
    }
}
