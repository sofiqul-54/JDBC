package com.domain;

import java.util.Date;

public class Sales {
private int id;
private String cName;
private String pName;
private String code;
private int quantity;
private double unitPrice;
private double totalPrice;
private Date salesDate;

private Purchase purchase;

    public Sales() {
    }

    public Sales(int id, String cName, String pName, String code, int quantity, double unitPrice, double totalPrice, Date salesDate, Purchase purchase) {
        this.id = id;
        this.cName = cName;
        this.pName = pName;
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.purchase = purchase;
    }

    public Sales(String cName, String pName, String code, int quantity, double unitPrice, double totalPrice, Date salesDate, Purchase purchase) {
        this.cName = cName;
        this.pName = pName;
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.purchase = purchase;
    }

    public Sales(String code, int quantity, double unitPrice, double totalPrice, Date salesDate, Purchase purchase) {
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.purchase = purchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Sales{" + "id=" + id + ", cName=" + cName + ", pName=" + pName + ", code=" + code + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + ", salesDate=" + salesDate + ", purchase=" + purchase + '}';
    }

    


}
