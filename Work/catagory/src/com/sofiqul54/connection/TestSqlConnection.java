
package com.sofiqul54.connection;

import java.sql.Connection;

public class TestSqlConnection {
    public static void main(String[] args) {
        Connection conn = SqlDbConnection.getConnection();
    }
 
}
