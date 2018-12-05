package com.sofiqul54.service;

import com.sofiqul54.connection.MySqlDbConnection;
import com.sofiqul54.domain.Purchase;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {

    static Connection conn = MySqlDbConnection.getConnection();
    
    public static void createpTable(){
    String sql = "create table purchase(id int auto_increment primary key, name varchar(30), price double, pdate date)";
    
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.execute();
            System.out.println("Purchase Table Hasbeen Created Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insert(Purchase p) {
        String sql = "insert into purchase(name, price, pdate) values(?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, p.getpName());
            ps.setDouble(2, p.getPrice());
            ps.setDate(3, new java.sql.Date(p.getpDate().getTime()));
            ps.executeUpdate();
            System.out.println("Data has been inserted into purchase table successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void update(Purchase p) {
        String sql = "update purchase set name=?, price=? where id=?";
        
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, p.getpName());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getId());
            ps.executeUpdate();
            System.out.println("Data has been updated successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void delete(Purchase p) {
        String sql = "delete from purchase where id=?";
        
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, p.getId());
            ps.executeUpdate();
            System.out.println("Data has been deleted from purchase table successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Purchase> getPurchaseTable(){
    List<Purchase> list = new ArrayList<>();
    String sql = "select id, name, price, pdate from purchase";
    
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Purchase p = new Purchase();
            p.setId(rs.getInt(1));
            p.setpName(rs.getString(2));
            p.setPrice(rs.getDouble(3));
            p.setpDate(rs.getDate(4));
            list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    
    }
   
}
