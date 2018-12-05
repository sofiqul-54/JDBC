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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class SummaryService {

    static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table purchaseSalesSummary(id int auto_increment primary key, name varchar(50), pCode varchar(30), totalQuantity int(11), soldQuantity int(11), availableQuantity int(11), lastUpdate Date, pId int(11), foreign key (pId) references cyclePurchase(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table Created!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insert(PurchaseSalesSummary summary) {
        String sql = "insert into purchaseSalesSummary(name, pCode, totalQuantity, soldQuantity, availableQuantity, lastUpdate, pId) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, summary.getName());
            ps.setString(2, summary.getpCode());
            ps.setInt(3, summary.getTotalQuantity());
            ps.setInt(4, summary.getSoldQuantity());
            ps.setInt(5, summary.getAvailableQuantity());
            ps.setDate(6, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setInt(7, summary.getCp().getId());
            ps.executeUpdate();
            System.out.println("Data Inserted! in Summary");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void update(PurchaseSalesSummary summary) {
        String sql = "update purchaseSalesSummary set totalQuantity=?, soldQuantity=?, availableQuantity=?, lastUpdate=? where pCode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, summary.getTotalQuantity());
            ps.setInt(2, summary.getSoldQuantity());
            ps.setInt(3, summary.getAvailableQuantity());
            ps.setDate(4, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setString(5, summary.getpCode());

            ps.executeUpdate();
            System.out.println("Data Updated in Summary!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PurchaseSalesSummary getSummaryByProductCode(String productCode) {
        PurchaseSalesSummary summary = new PurchaseSalesSummary();
        String sql = "select * from purchaseSalesSummary where pCode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                summary.setId(rs.getInt(1));
                summary.setName(rs.getString(2));
                summary.setpCode(rs.getString(3));
                summary.setTotalQuantity(rs.getInt(4));
                summary.setSoldQuantity(rs.getInt(5));
                summary.setAvailableQuantity(rs.getInt(6));
                summary.setLastUpdate(rs.getDate(7));
                CyclePurchase p = new CyclePurchase();
                p.setId(rs.getInt(8));
                summary.setCp(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return summary;
    }
    
    public static List<PurchaseSalesSummary> getSummaryList() {
        List<PurchaseSalesSummary> list = new ArrayList<>();
        
        String sql = "select name, pCode, totalQuantity, soldQuantity, availableQuantity, lastUpdate, pId from purchasesalessummary";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                PurchaseSalesSummary summary = new PurchaseSalesSummary();
                summary.setName(rs.getString(1));
                summary.setpCode(rs.getString(2));
                summary.setTotalQuantity(rs.getInt(3));
                summary.setSoldQuantity(rs.getInt(4));
                summary.setAvailableQuantity(rs.getInt(5));
                summary.setLastUpdate(rs.getDate(6));
                CyclePurchase p = new CyclePurchase();
                p.setId(rs.getInt(7));
                summary.setCp(p);
                list.add(summary);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return list;
    }
}
