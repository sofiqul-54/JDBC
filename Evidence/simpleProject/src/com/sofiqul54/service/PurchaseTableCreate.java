
package com.sofiqul54.service;

import com.sofiqul54.connection.MySqlDbConnection;
import com.sofiqul54.domain.Purchases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseTableCreate {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static void createTable(){
    String sql ="create table purchase(id int auto_increment primary key, p_code int(11) not null, p_name varchar(30) not null, quantity int(11) not null, unit_price double, total_price double, p_date date)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Purchase Table hasbenn created successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseTableCreate.class.getName()).log(Level.SEVERE, null, ex);
        }                    
    }
    
    public static void insertDataToPurchase(Purchases p) {
        String sql = "insert into purchase(p_code, p_name, quantity, unit_price, total_price, p_date) values(?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, p.getpCode());
            ps.setString(2, p.getpName());
            ps.setInt(3, p.getQuantity());
            ps.setDouble(4, p.getUnitPrice());
            ps.setDouble(5, p.getTotalPrice());
            ps.setDate(6, new java.sql.Date(p.getpDate().getTime()));
            ps.executeUpdate();
            System.out.println("Data has been inserted to Purchase table");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseTableCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
