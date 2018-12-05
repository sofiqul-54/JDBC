/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author user
 */
public class DashBoardClass {

    private double todaysPurchaseAmount;
    private double entirePurchaseAmount;
    private int totalItems;
    private int todaysPurchaseItem;
    private double todaysSalesAmount;
    private double entireSalesAmount;
    private int totalSoldItems;
    private int todaysSoldItems;

    public double getTodaysPurchaseAmount() {
        return todaysPurchaseAmount;
    }

    public void setTodaysPurchaseAmount(double todaysPurchaseAmount) {
        this.todaysPurchaseAmount = todaysPurchaseAmount;
    }


    public double getEntirePurchaseAmount() {
        return entirePurchaseAmount;
    }

    public void setEntirePurchaseAmount(double entirePurchaseAmount) {
        this.entirePurchaseAmount = entirePurchaseAmount;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTodaysPurchaseItem() {
        return todaysPurchaseItem;
    }

    public void setTodaysPurchaseItem(int todaysPurchaseItem) {
        this.todaysPurchaseItem = todaysPurchaseItem;
    }

    public double getTodaysSalesAmount() {
        return todaysSalesAmount;
    }

    public void setTodaysSalesAmount(double todaysSalesAmount) {
        this.todaysSalesAmount = todaysSalesAmount;
    }


    public double getEntireSalesAmount() {
        return entireSalesAmount;
    }

    public void setEntireSalesAmount(double entireSalesAmount) {
        this.entireSalesAmount = entireSalesAmount;
    }

    public int getTotalSoldItems() {
        return totalSoldItems;
    }

    public void setTotalSoldItems(int totalSoldItems) {
        this.totalSoldItems = totalSoldItems;
    }

    public int getTodaysSoldItems() {
        return todaysSoldItems;
    }

    public void setTodaysSoldItems(int todaysSoldItems) {
        this.todaysSoldItems = todaysSoldItems;
    }

}
