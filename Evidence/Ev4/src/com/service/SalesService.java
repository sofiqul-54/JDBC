
package com.service;

import com.connection.MySqlDbConnection;
import static com.service.PurchaseService.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesService {
     static Connection conn = MySqlDbConnection.getConnection();
     
     
    public static void createTable(){
    String sql = "create table sales(id int auto_increment primary key, cName varchar(30), pName varchar(30), code varchar(11), quantity int, unitPrice double, totalPrice double, salsedate date, p_id int, foreign key (p_id) references purchase(id))";
    
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.execute();
            System.out.println("Table hasbeen Created Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
