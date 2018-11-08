
package todooperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateData {
    static Connection conn = SqlDbConnection.getConnection();
    
    public static void update(Student s) {
        String sql = "update students set name=?, email=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt(3, s.getId());
            ps.executeUpdate();
            
            System.out.println("Data has been updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
