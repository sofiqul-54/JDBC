/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connection.MySqlDbConnection;
import domain.CyclePurchase;
import domain.CycleSales;
import domain.DashBoardClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DateFormating;

/**
 *
 * @author User
 */
public class ReportService {

    static Connection conn = MySqlDbConnection.getConnection();

    //////////////////////////Purchase/////////////////////////////////////////////////////////
    public static List<CyclePurchase> getProductListByDateRange(Date startdate, Date endDate) {
        List<CyclePurchase> list = new ArrayList<>();

        String sql = "select * from cyclepurchase where purchaseDate between ? and ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(startdate.getTime()));
            ps.setDate(2, new java.sql.Date(endDate.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CyclePurchase purchase = new CyclePurchase();
                purchase.setId(rs.getInt(1));
                purchase.setName(rs.getString(2));
                purchase.setpCode(rs.getString(3));
                purchase.setQuantity(rs.getInt(4));
                purchase.setUnitPrice(rs.getDouble(5));
                purchase.setTotlalPrice(rs.getDouble(6));
                purchase.setPurchaseDate(rs.getDate(7));

                list.add(purchase);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Double getTotalPurchaseAmount() {
        Double totalPurchaseAmount = 0.0;
        String sql = "select totalPrice from cyclepurchase";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                totalPurchaseAmount += rs.getDouble(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPurchaseAmount;
    }

    public static int getTotalPurchaseItems() {
        int totalPurchaseItems = 0;
        String sql = " select quantity from cyclepurchase";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                totalPurchaseItems += rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPurchaseItems;
    }

    public static int getTotalPurchaseItemsByToday(Date today) {
        int totalPurchaseItems = 0;
        String sql = "select sum(quantity) from cyclepurchase where purchaseDate=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(today.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                totalPurchaseItems = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPurchaseItems;
    }
    
    public static Double getTodayPurchaseAmount(Date today) {
        Double todayPurchaseAmount = 0.0;
        String sql = "select sum(totalPrice) from cyclepurchase where purchaseDate=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(today.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                todayPurchaseAmount = rs.getDouble(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return todayPurchaseAmount;
    }

    //////////////////////////////////Sales///////////////////////////////////////////
    public static List<CycleSales> getSalesByDateRange(Date startdate, Date endDate) {
        List<CycleSales> list = new ArrayList<>();

        String sql = "select cname, pname, pCode, quantity, unitPrice, totalPrice, salesDate, pId from CycleSales where salesDate between ? and ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(startdate.getTime()));
            ps.setDate(2, new java.sql.Date(endDate.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CycleSales sales = new CycleSales();
                sales.setcName(rs.getString(1));
                sales.setpName(rs.getString(2));
                sales.setpCode(rs.getString(3));
                sales.setQuantity(rs.getInt(4));
                sales.setUnitPrice(rs.getDouble(5));
                sales.setTotlalPrice(rs.getDouble(6));
                sales.setSalesDate(rs.getDate(7));
                CyclePurchase p = new CyclePurchase();
                p.setId(rs.getInt(8));
                sales.setCp(p);
                list.add(sales);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Double getSalesAmountByToday(Date today) {
        Double amount = 0.0;
        String sql = "select sum(totalPrice) from CycleSales where salesDate=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(today.getTime()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                amount = rs.getDouble(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return amount;
    }

    public static double getSalesTotalAmount() {
        double amount = 0.0;
        String sql = "select totalPrice from CycleSales";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                amount += rs.getDouble(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return amount;
    }

    public static int getSalesTotalItems() {
        int amount = 0;
        String sql = "select quantity from CycleSales";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                amount += rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return amount;
    }

    public static int getSoldTodayItems(Date today) {
        int item = 0;
        String sql = "select sum(quantity) from CycleSales where salesDate=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(today.getTime()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                item = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;
    }
    
     public static DashBoardClass getDashboardDetails() {
        DashBoardClass adb = new DashBoardClass();

        adb.setEntirePurchaseAmount(getTotalPurchaseAmount());
        adb.setTotalItems(getTotalPurchaseItems());
        adb.setTodaysPurchaseItem(getTotalPurchaseItemsByToday(DateFormating.getDateFromString(DateFormating.getStringFromDate(new Date()))));
        adb.setTodaysPurchaseAmount(getTodayPurchaseAmount(DateFormating.getDateFromString(DateFormating.getStringFromDate(new Date()))));
        
        ///////////sales part/////////////////
        adb.setTodaysSalesAmount(getSalesAmountByToday(DateFormating.getDateFromString(DateFormating.getStringFromDate(new Date()))));
        adb.setEntireSalesAmount(getSalesTotalAmount());
        adb.setTotalSoldItems(getSalesTotalItems());
        adb.setTodaysSoldItems(getSoldTodayItems(DateFormating.getDateFromString(DateFormating.getStringFromDate(new Date()))));

        return adb;
    }
}
