
package com.sofiqul54.service;

import com.sofiqul54.connection.SqlDbConnection;
import com.sofiqul54.inventory.CreateTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CreateProductTable {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table product(id int(11) auto_increment primary key,"
                + "name varchar(30), quantity int(30), unitPrice double, "
                + "totalPrice double,purchaseDate date, cat_id int(11), FOREIGN KEY(cat_id) REFERENCES catagory(id))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table Has Been Created.");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
