
package createconnection;

import java.sql.Connection;



/**
 *
 * @author Sofiqul Islam
 */
public class TestMySqlConnection {
    public static void main(String[] args) {
        Connection hgg = MySqlBdConnection.getConnection();
    }
}
