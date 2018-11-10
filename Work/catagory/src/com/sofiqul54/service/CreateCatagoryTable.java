
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
public class CreateCatagoryTable {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table catagory(id int(11)auto_increment primary key, name varchar(30))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table Has Been Created.");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
