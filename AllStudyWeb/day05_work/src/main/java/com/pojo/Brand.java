package com.pojo;



/**
 * @author FF
 * @date 2021/10/20
 * @TIME:19:15
 */

public class Brand {
    /*
     * 使用对应包装类型
     * */
    //id 主键
    private Integer orderId;
    //商品详情
    private Integer brandId;
    //数量
    private Integer brandNum;
    //价格
    private Double price;
    //用户信息
    private String userId;
    //备注
    private  String message;
    //时间
    private String buyTime;
    // 支付状态
    private String defray;
    //状态：0：待付款  1：待发货 2：待收货 3：待评价 4：已完成  5：已取消
    private Integer status;
    // 商品对象
    private Brands brands;
    // 用户对象
    private User user;

    @Override
    public String toString() {
        return "Brand{" +
                "orderId=" + orderId +
                ", " + brands +
                ", brandNum=" + brandNum +
                ", price=" + price +
                "," + user + '\'' +
                ", message='" + message + '\'' +
                ", buyTime='" + buyTime + '\'' +
                ", defray='" + defray + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBrandNum() {
        return brandNum;
    }

    public void setBrandNum(Integer brandNum) {
        this.brandNum = brandNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getDefray() {
        return defray;
    }

    public void setDefray(String defray) {
        this.defray = defray;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Brand() {
    }

    public Brand(Integer orderId, Integer brandId, Integer brandNum, Double price, String userId, String message, String buyTime, String defray, Integer status, Brands brands, User user) {
        this.orderId = orderId;
        this.brandId = brandId;
        this.brandNum = brandNum;
        this.price = price;
        this.userId = userId;
        this.message = message;
        this.buyTime = buyTime;
        this.defray = defray;
        this.status = status;
        this.brands = brands;
        this.user = user;
    }
}
