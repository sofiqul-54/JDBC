/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author user
 */
public class CyclePurchase {
    private int id;
    private String name;
    private String pCode;
    private int quantity;
    private double unitPrice;
    private double totlalPrice;
    private Date purchaseDate;

    public CyclePurchase() {
    }

    public CyclePurchase(int id, String name, String pCode, int quantity, double unitPrice, double totlalPrice, Date purchaseDate) {
        this.id = id;
        this.name = name;
        this.pCode = pCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totlalPrice = totlalPrice;
        this.purchaseDate = purchaseDate;
    }

    public CyclePurchase(String name, String pCode, int quantity, double unitPrice, double totlalPrice, Date purchaseDate) {
        this.name = name;
        this.pCode = pCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totlalPrice = totlalPrice;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
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

    public double getTotlalPrice() {
        return totlalPrice;
    }

    public void setTotlalPrice(double totlalPrice) {
        this.totlalPrice = totlalPrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Cycles{" + "id=" + id + ", name=" + name + ", pCode=" + pCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totlalPrice=" + totlalPrice + ", purchaseDate=" + purchaseDate + '}';
    }
    
    
}
