/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class InsertDataToTable {
    static Connection conn = MySqlBdConnection.getConnection();
    public static void insertData() {
        String sql = "insert into division(id, name) values(1, 'Dhaka')";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Data has been inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insertData2(int d, String n) {
        String sql ="insert into division(id, name) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, d);
            ps.setString(2, n);
            ps.executeUpdate();
            
            System.out.println("Data has been inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /////////////////query////////////////
    public static void getDataById(int id) {
        String sql = "select * from division where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID  "+rs.getInt(1)+"  Name  "+rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
 
}
