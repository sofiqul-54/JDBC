
package com.sofiqul54.domain;

import java.util.Date;

public class Purchases {
   private int id;
   private int pCode;
   private String pName;
   private int quantity;
   private double unitPrice;
   private double totalPrice;
   private Date pDate;

    public Purchases() {
    }

    public Purchases(int id, int pCode, String pName, int quantity, double unitPrice, double totalPrice, Date pDate) {
        this.id = id;
        this.pCode = pCode;
        this.pName = pName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.pDate = pDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getpCode() {
        return pCode;
    }

    public void setpCode(int pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    @Override
    public String toString() {
        return "Purchases{" + "id=" + id + ", pCode=" + pCode + ", pName=" + pName + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + ", pDate=" + pDate + '}';
    }

    
}
