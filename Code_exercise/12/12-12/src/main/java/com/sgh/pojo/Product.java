package com.sgh.pojo;

public class Product {
    private String proId;        //商品id
    private String proName;        //商品名称

    public Product(String proId, String proName) {
        this.proId = proId;
        this.proName = proName;
    }

    public Product() {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }
}

