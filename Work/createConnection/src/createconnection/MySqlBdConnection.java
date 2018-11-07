
package createconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlBdConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "bangladesh";
    private static final String URL = HOST + "/" + DBNAME;
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            con =DriverManager.getConnection(URL, "root", "1234");
            System.out.println("::Connection::");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlBdConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
