package com.domain;

import java.util.Date;

public class Purchase {
private int id;
private String pName;
private String code;
private int quantity;
private double unitPrice;
private double totalPrice;
private Date purcaheDate;

    public Purchase() {
    }

    public Purchase(int id, String pName, String code, int quantity, double unitPrice, double totalPrice, Date purcaheDate) {
        this.id = id;
        this.pName = pName;
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purcaheDate = purcaheDate;
    }

    public Purchase(String pName, String code, int quantity, double unitPrice, double totalPrice, Date purcaheDate) {
        this.pName = pName;
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purcaheDate = purcaheDate;
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

    public Date getPurcaheDate() {
        return purcaheDate;
    }

    public void setPurcaheDate(Date purcaheDate) {
        this.purcaheDate = purcaheDate;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", pName=" + pName + ", code=" + code + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + ", purcaheDate=" + purcaheDate + '}';
    }


}
