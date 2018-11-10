
package com.sofiqul54.serviceInsert;

import com.sofiqul54.domain.Catagory;
import com.sofiqul54.connection.SqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataToCatagoryTable {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static void insertData(Catagory s) {
        String sql = "insert into catagory(name) values(?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);           
            ps.setString(1, s.getName());           
            ps.executeUpdate();
            
            System.out.println("Data has been inserted into students table");
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToCatagoryTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
