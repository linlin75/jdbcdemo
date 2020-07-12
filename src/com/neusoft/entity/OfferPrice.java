package com.neusoft.entity;

import java.util.Date;

public class OfferPrice {
    private int ofpId;
    private String effetiveStarDate;
    private String effetiveEndDate;
    private int proId;
    private double price;
    private String typeCD;

    public OfferPrice() {
        super();
    }

    public OfferPrice(int ofpId, String effetiveStarDate, String effetiveEndDate, int proId, double price, String typeCD) {
        this.ofpId = ofpId;
        this.effetiveStarDate = effetiveStarDate;
        this.effetiveEndDate = effetiveEndDate;
        this.proId = proId;
        this.price = price;
        this.typeCD = typeCD;
    }

    public int getOfpId() {
        return ofpId;
    }

    public void setOfpId(int ofpId) {
        this.ofpId = ofpId;
    }

    public String getEffetiveStarDate() {
        return effetiveStarDate;
    }

    public void setEffetiveStarDate(String effetiveStarDate) {
        this.effetiveStarDate = effetiveStarDate;
    }

    public String getEffetiveEndDate() {
        return effetiveEndDate;
    }

    public void setEffetiveEndDate(String effetiveEndDate) {
        this.effetiveEndDate = effetiveEndDate;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
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
        return "OfferPrice{" +
                "ofpId=" + ofpId +
                ", effetiveStarDate='" + effetiveStarDate + '\'' +
                ", effetiveEndDate='" + effetiveEndDate + '\'' +
                ", proId=" + proId +
                ", price=" + price +
                ", typeCD='" + typeCD + '\'' +
                '}';
    }
}
