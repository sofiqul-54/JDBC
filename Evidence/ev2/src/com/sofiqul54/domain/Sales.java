
package com.sofiqul54.domain;

import java.util.Date;

public class Sales {
    private int id;
    private String pName;
    private double price;
    private Date sDate;
    private Purchase p;

    public Sales() {
    }

    public Sales(String pName, double price, Date sDate, Purchase p) {
        this.pName = pName;
        this.price = price;
        this.sDate = sDate;
        this.p = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public Purchase getP() {
        return p;
    }

    public void setP(Purchase p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Sales{" + "id=" + id + ", pName=" + pName + ", price=" + price + ", sDate=" + sDate + ", p=" + p + '}';
    }
    
    
    
}
