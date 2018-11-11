
package com.sofiqul54.list;

import com.sofiqul54.connection.SqlDbConnection;
import com.sofiqul54.domain.Catagory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListShowCatagory {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static List<Catagory> getCatagoryList(){
    List<Catagory> list = new ArrayList<>();
    String sql = "select * from catagory";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            list.add(new Catagory(rs.getInt(1), rs.getString(2)));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ListShowCatagory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
