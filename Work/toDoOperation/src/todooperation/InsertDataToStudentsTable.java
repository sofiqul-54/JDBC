
package todooperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataToStudentsTable {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static void insertData(Student s) {
        String sql = "insert into students(id, name, email) values(?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.executeUpdate();
            
            System.out.println("Data has been inserted into students table");
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToStudentsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
