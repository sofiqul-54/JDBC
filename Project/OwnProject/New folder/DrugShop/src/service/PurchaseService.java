/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connection.MySqlDbConnection;
import domain.CyclePurchase;
import domain.PurchaseSalesSummary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PurchaseService {

    static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table cyclePurchase(id int auto_increment primary key, name varchar(30), pCode varchar(30), quantity int(11), unitPrice double, totalPrice double, purchaseDate Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table Created!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insert(CyclePurchase purchase) {
        String sql = "insert into cyclePurchase(name, pCode, quantity, unitPrice, totalPrice, purchaseDate) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchase.getName());
            ps.setString(2, purchase.getpCode());
            ps.setInt(3, purchase.getQuantity());
            ps.setDouble(4, purchase.getUnitPrice());
            ps.setDouble(5, purchase.getTotlalPrice());
            ps.setDate(6, new java.sql.Date(purchase.getPurchaseDate().getTime()));
            ps.executeUpdate();
            System.out.println("Data Inserted!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static CyclePurchase getPurchaseByProductCode(String productCode) {
        CyclePurchase purchase = new CyclePurchase();
        String sql = "select * from cyclePurchase where pCode=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                purchase.setId(rs.getInt(1));
                purchase.setName(rs.getString(2));
                purchase.setpCode(rs.getString(3));
                purchase.setQuantity(rs.getInt(4));
                purchase.setUnitPrice(rs.getDouble(5));
                purchase.setTotlalPrice(rs.getDouble(6));
                purchase.setPurchaseDate(rs.getDate(7));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return purchase;
    }

    public static void insertToPurchase(CyclePurchase purchase) {
        if (purchase != null) {
            insert(purchase);
            CyclePurchase p = getPurchaseByProductCode(purchase.getpCode());
            PurchaseSalesSummary summary = SummaryService.getSummaryByProductCode(purchase.getpCode());
            if (purchase.getpCode().equalsIgnoreCase(summary.getpCode())) {
                int totalQty = summary.getTotalQuantity() + purchase.getQuantity();
                int avilQty = summary.getAvailableQuantity() + purchase.getQuantity();
                summary.setTotalQuantity(totalQty);
                summary.setAvailableQuantity(avilQty);
                summary.setLastUpdate(new Date());
                SummaryService.update(summary);
            } else {
                PurchaseSalesSummary summary3 = new PurchaseSalesSummary(purchase.getName(), purchase.getpCode(), purchase.getQuantity(), 0, purchase.getQuantity(), new Date(), p);
                SummaryService.insert(summary3);
            }
        }
    }

    public static CyclePurchase getProductDetails(String productCode) {
        CyclePurchase purchase = new CyclePurchase();
        String sql = " select * from cyclePurchase where pCode=? limit 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                purchase.setId(rs.getInt(1));
                purchase.setName(rs.getString(2));
                purchase.setpCode(rs.getString(3));
                purchase.setQuantity(rs.getInt(4));
                purchase.setUnitPrice(rs.getDouble(5));
                purchase.setTotlalPrice(rs.getDouble(6));
                purchase.setPurchaseDate(rs.getDate(7));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }
    
    public static List<CyclePurchase> getProductList() {
        List<CyclePurchase> list = new ArrayList<>();

        String sql = "select * from cyclepurchase";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
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
}
