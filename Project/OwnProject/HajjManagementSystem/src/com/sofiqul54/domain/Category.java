package com.sofiqul54.domain;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class Category {

    private int id;
    private String name;
    private double packagePrice;

    public Category() {
    }

    public Category(int id, String name, double packagePrice) {
        this.id = id;
        this.name = name;
        this.packagePrice = packagePrice;
    }

    public Category(String a, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", packagePrice=" + packagePrice + '}';
    }

    
}
