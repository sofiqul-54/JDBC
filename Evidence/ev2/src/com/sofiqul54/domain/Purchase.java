
package com.sofiqul54.domain;

import java.util.Date;

public class Purchase {
    private int id;
    private String pName;
    private double price;
    private Date pDate;

    public Purchase() {
    }

    public Purchase(String pName, double price, Date pDate) {
        this.pName = pName;
        this.price = price;
        this.pDate = pDate;
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

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", pName=" + pName + ", price=" + price + ", pDate=" + pDate + '}';
    }
    
    
}
