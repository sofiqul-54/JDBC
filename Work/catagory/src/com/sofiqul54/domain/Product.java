
package com.sofiqul54.domain;

import java.util.Date;



/**
 *
 * @author Md. Sofiqul Islam
 */
public class Product {
    private int Id;
    private String name;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private Date purchaseDate;
   //private int cat_id;
    private Catagory catagory;

    public Product() {
    }

    public Product(int Id, String name, int quantity, double unitPrice, double totalPrice, Date purchaseDate, Catagory catagory) {
        this.Id = Id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
        this.catagory = catagory;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

   
   
    
}
