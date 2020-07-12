package com.neusoft.entity;
import java.util.Date;

public class PS {
    private Integer proId;
    private String sku;
    private String title;
    private int ofpId;
    private Date effetiveStarDate;
    private Date effetiveEndDate;
    private double price;
    private String typeCD;

    public PS(Integer proId, String title, double price, String typeCD) {
        this.proId = proId;
        this.title = title;
        this.price = price;
        this.typeCD = typeCD;
    }

    public PS(Integer proId, String sku, String title, int ofpId, Date effetiveStarDate, Date effetiveEndDate, double price, String typeCD) {
        this.proId = proId;
        this.sku = sku;
        this.title = title;
        this.ofpId = ofpId;
        this.effetiveStarDate = effetiveStarDate;
        this.effetiveEndDate = effetiveEndDate;
        this.price = price;
        this.typeCD = typeCD;
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

    public int getOfpId() {
        return ofpId;
    }

    public void setOfpId(int ofpId) {
        this.ofpId = ofpId;
    }

    public Date getEffetiveStarDate() {
        return effetiveStarDate;
    }

    public void setEffetiveStarDate(Date effetiveStarDate) {
        this.effetiveStarDate = effetiveStarDate;
    }

    public Date getEffetiveEndDate() {
        return effetiveEndDate;
    }

    public void setEffetiveEndDate(Date effetiveEndDate) {
        this.effetiveEndDate = effetiveEndDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeCD() {
        return typeCD;
    }

    public void setTypeCD(String typeCD) {
        this.typeCD = typeCD;
    }

    @Override
    public String toString() {
        return "PS{" +
                "proId=" + proId +
                ", sku='" + sku + '\'' +
                ", title='" + title + '\'' +
                ", ofpId=" + ofpId +
                ", effetiveStarDate=" + effetiveStarDate +
                ", effetiveEndDate=" + effetiveEndDate +
                ", price=" + price +
                ", typeCD='" + typeCD + '\'' +
                '}';
    }
}
