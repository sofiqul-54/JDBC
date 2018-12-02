
package com.sofiqul54.serviceInsert;

import com.sofiqul54.connection.SqlDbConnection;
import com.sofiqul54.domain.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataToProductTable {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static void insertDataProduct(Product p) {
        String sql = "insert into product(name, quantity, unitPrice, totalPrice, purchaseDate, cat_id) values(?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);            
            ps.setString(1, p.getName());
            ps.setInt(2, p.getQuantity());
            ps.setDouble(3, p.getUnitPrice());
            ps.setDouble(4, p.getTotalPrice());
            ps.setDate(5, new java.sql.Date(p.getPurchaseDate().getTime()));
            ps.setInt(6, p.getCatagory().getId());            
            ps.executeUpdate();
            
            System.out.println("Data has been inserted into students table");
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
