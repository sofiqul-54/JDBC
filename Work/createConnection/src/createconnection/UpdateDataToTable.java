/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UpdateDataToTable {
    static Connection conn = MySqlBdConnection.getConnection();
    
    public static void updateData() {
        String sql = "update division set Name='Dinajpur' where id=1";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Data has been updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDataToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void updateData2(String n, int d) {
        String sql = "update division set Name=? where id=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1 , n);
            ps.setInt(2, d);
            ps.executeUpdate();
            System.out.println("Data has been updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDataToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
