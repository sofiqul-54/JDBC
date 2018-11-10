
package com.sofiqul54.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SqlDbConnection {
   private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "msi";
    private static final String URL = HOST + "/" + DBNAME;
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            con = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("::Connection::");
        } catch (SQLException ex) {
            Logger.getLogger(SqlDbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
