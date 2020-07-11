package com.neusoft.entity;

public class Product {
    private Integer proId;
    private String sku;
    private String title;

    public Product() {
        super();
    }

    public Product(Integer proId, String sku, String title) {
        this.proId = proId;
        this.sku = sku;
        this.title = title;
    }

    public Product(String string) {
        this.title = title;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nproId=" + proId +
                "\nsku=" + sku +
                "\ntitle=" + title + "\n";
    }
}
