package com.service;

import com.connection.MySqlDbConnection;
import com.domain.Purchase;
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

    public static void createTable() {
        String sql = "create table purchase(id int auto_increment primary key, pName varchar(30), code varchar(11), quantity int, unitPrice double, totalPrice double, puchasedate date)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.execute();
            System.out.println("Table hasbeen Created Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertTable(Purchase purchase) {
        String sql = "insert into purchase(pName, code, quantity, unitPrice, totalPrice, puchasedate) values(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, purchase.getpName());
            ps.setString(2, purchase.getCode());
            ps.setInt(3, purchase.getQuantity());
            ps.setDouble(4, purchase.getUnitPrice());
            ps.setDouble(5, purchase.getTotalPrice());
            ps.setDate(6, new java.sql.Date(purchase.getPurcaheDate().getTime()));
            ps.executeUpdate();
            System.out.println("Table hasbeen Inserted into Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateTable(Purchase purchase) {
        String sql = "update purchase set pName=?, code=?, quantity=?, unitPrice=?, totalPrice=? where id=?";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, purchase.getpName());
            ps.setString(2, purchase.getCode());
            ps.setInt(3, purchase.getQuantity());
            ps.setDouble(4, purchase.getUnitPrice());
            ps.setDouble(5, purchase.getTotalPrice());
            ps.setInt(6, purchase.getId());
            ps.executeUpdate();
            System.out.println("Table Data has been Updated into Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(Purchase purchase) {
        String sql = "delete from purchase where id=?";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, purchase.getId());
            ps.executeUpdate();
            System.out.println("Table Data has been Updated into Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Purchase> getPurchaseTable(){
        List<Purchase> list = new ArrayList<>();
        String sql = "select id, pName, code, unitPrice, totalPrice, puchasedate from purchase";
       //id, pName, code, unitPrice, totalPrice, puchasedate
       try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Purchase p = new Purchase();
                p.setId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setCode(rs.getString(3));
                p.setQuantity(rs.getInt(4));
                p.setUnitPrice(rs.getDouble(5));
                p.setTotalPrice(rs.getDouble(6));
                p.setPurcaheDate(rs.getDate(7));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
}
