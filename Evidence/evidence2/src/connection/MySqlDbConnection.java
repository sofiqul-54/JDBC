/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MySqlDbConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "evidence2";
    private static final String URL = HOST + "/" + DBNAME;
    private static Connection conn = null;
    
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("::connected::");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
