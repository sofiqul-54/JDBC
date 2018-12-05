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
public class PurchaseSalesSummary {
    private int id;
    private String name;
    private String pCode;
    private int totalQuantity;
    private int soldQuantity;
    private int availableQuantity;
    private Date lastUpdate;
    private CyclePurchase cp;

    public PurchaseSalesSummary() {
    }

    public PurchaseSalesSummary(int id, String name, String pCode, int totalQuantity, int soldQuantity, int availableQuantity, Date lastUpdate, CyclePurchase cp) {
        this.id = id;
        this.name = name;
        this.pCode = pCode;
        this.totalQuantity = totalQuantity;
        this.soldQuantity = soldQuantity;
        this.availableQuantity = availableQuantity;
        this.lastUpdate = lastUpdate;
        this.cp = cp;
    }

    public PurchaseSalesSummary(String name, String pCode, int totalQuantity, int soldQuantity, int availableQuantity, Date lastUpdate, CyclePurchase cp) {
        this.name = name;
        this.pCode = pCode;
        this.totalQuantity = totalQuantity;
        this.soldQuantity = soldQuantity;
        this.availableQuantity = availableQuantity;
        this.lastUpdate = lastUpdate;
        this.cp = cp;
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

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public CyclePurchase getCp() {
        return cp;
    }

    public void setCp(CyclePurchase cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "PurchaseSalesSummary{" + "id=" + id + ", name=" + name + ", pCode=" + pCode + ", totalQuantity=" + totalQuantity + ", soldQuantity=" + soldQuantity + ", availableQuantity=" + availableQuantity + ", lastUpdate=" + lastUpdate + ", cp=" + cp + '}';
    }
    
    
}
