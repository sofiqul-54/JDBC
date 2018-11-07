
package createconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableUsingMySql {
private static Connection conn = MySqlBdConnection.getConnection();

    public static void createTable() {
        String sql = "create table division(id int(11), name varchar(30))";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Table has been Created.");
    } catch (SQLException ex) {
        Logger.getLogger(CreateTableUsingMySql.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
}
